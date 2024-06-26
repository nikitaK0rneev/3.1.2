package com.example312.dao;

import com.example312.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    void createUser(User user);

    void deleteUserById(int id);

    void updateUser(User user);

    User find(int id);
}
