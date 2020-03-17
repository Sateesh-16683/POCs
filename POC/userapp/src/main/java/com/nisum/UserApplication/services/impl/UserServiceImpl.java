package com.nisum.UserApplication.services.impl;

import com.nisum.UserApplication.dao.UserDAO;
import com.nisum.UserApplication.entity.User;
import com.nisum.UserApplication.services.NextSequenceService;
import com.nisum.UserApplication.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private NextSequenceService nextSequenceService;

    public User userLogin(String email, String password) {
        if (email != null && password != null){
            User user = userDAO.findByEmailAndPassword(email, password);
            return  user;
        }
        return null;
    }

    public User save(User user) {
        if (user != null){
            user.userId = nextSequenceService.getNextSequence("User");
            return  userDAO.save(user);
        }
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return userDAO.findAll();
    }

    @Override
    public User update(User user) {
        if (user != null){
            User user1 = userDAO.findByUserId(user.userId);
            user1.description = user.description;
            user1.role = user.role;
            user1.name = user.name;
            user1.password = user.password;
            userDAO.save(user1);
            return user1;
        }
        return null;
    }

}
