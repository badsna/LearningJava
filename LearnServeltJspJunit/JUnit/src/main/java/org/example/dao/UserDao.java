package org.example.dao;

import org.example.model.User;

import java.util.List;

public interface UserDao {
    public int addUser(int id,String username, String password);
    boolean updateUser(int id);
    User getById(int id);

    boolean deleteUser(int id);

    public List<User> getAllUsers();
}
