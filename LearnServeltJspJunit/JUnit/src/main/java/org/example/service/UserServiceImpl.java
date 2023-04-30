package org.example.service;

import org.example.dao.UserDao;
import org.example.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public int addUser(int id,String username,String password){
        if((id ==0) || username.equalsIgnoreCase("") || password.equalsIgnoreCase("") )
            throw new IllegalArgumentException("empty credentials");

        int count= userDao.addUser(id, username, password);
        if(count==0){
            return 0;
        }
        return 1;
    }

    public boolean updateUser(int id){
        User user=userDao.getById(id);
        if(id<=0 ){
            throw new IllegalArgumentException("doesn't have user");
        }
      else if (user != null) {
          userDao.updateUser(id);
          return true;
        }
      return false;
    }

    @Override
    public boolean deleteUser(int id) {
        User user=userDao.getById(id);
        if(id<=0){
            throw new RuntimeException("doesn't have user");
        } else if (user!=null) {
            userDao.deleteUser(id);
            return true;
        }
        return false;
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }
}
