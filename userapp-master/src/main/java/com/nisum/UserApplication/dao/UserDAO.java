package com.nisum.UserApplication.dao;

import com.nisum.UserApplication.entity.User;
import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserDAO  extends MongoRepository<User, String> {

    User findByEmailAndPassword(String email, String password);

    User findByUserId(int userId);
}
