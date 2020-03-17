package com.nisum.UserApplication.services;

import com.nisum.UserApplication.entity.User;

import java.util.List;

public interface UserService {
    public User userLogin(String email, String password);

    public User save(User user);

    public List<User> getAllUsers();

    public User update(User user);
}
