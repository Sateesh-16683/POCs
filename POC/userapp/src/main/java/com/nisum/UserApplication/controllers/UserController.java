package com.nisum.UserApplication.controllers;


import com.nisum.UserApplication.entity.User;
import com.nisum.UserApplication.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResponseEntity<User> login(@RequestBody User user)
    {
        User user1 =  userService.userLogin(user.email, user.password);
        return new ResponseEntity<User>(user1, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<User> save(@RequestBody User user)
    {
        User user1 =  userService.save(user);
        return new ResponseEntity<User>(user1, HttpStatus.OK);
    }
    @GetMapping("/users")
    public List<User> getAllUsers()
    {
        List<User> userList =  userService.getAllUsers();
        return userList;
    }

    @PostMapping("/update")
    public ResponseEntity<User> update(@RequestBody User user)
    {
        User user1 =  userService.update(user);
        return new ResponseEntity<User>(user1, HttpStatus.OK);
    }
}
