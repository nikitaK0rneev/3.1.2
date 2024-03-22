package com.example312.service;

import com.example312.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void createUser(User user);

    void deleteUserById(int id);

    void updateUser(User user);

    User find(int id);
}
