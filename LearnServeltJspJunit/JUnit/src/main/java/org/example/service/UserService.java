package org.example.service;

import org.example.model.User;

import java.util.List;

public interface UserService {
    public int addUser(int id,String username,String password);
    public boolean updateUser(int id);

    boolean deleteUser(int id);

    List<User> getAllUsers();
    }
