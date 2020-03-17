package com.nisum.UserApplication.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "UserDetails")
@Getter
@Setter
@NoArgsConstructor
public class User {

    @Id
    private String id;

    public int userId;

    public String email;

    public String name;

    public String password;

    public String role;

    public String description;

    public User(String id, int userId, String email, String name, String password, String role, String description) {
        this.id = id;
        this.userId = userId;
        this.email = email;
        this.name = name;
        this.password = password;
        this.role = role;
        this.description = description;
    }
}
