package org.example.service;

import org.example.dao.UserDao;

import org.example.model.User;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class UserServiceTest {
    @InjectMocks
    private static UserServiceImpl userService;
    //dao ma repo hunxa jasley db sanga kaam garxa but hami ahley hami sanga db xaina sochyaraw fake object banaumxau

    @Mock
    private static UserDao userDao;

    public UserServiceTest() {
        MockitoAnnotations.openMocks(this);

    }

    @Test
    public void testaddUserWithEmptyId(){
        assertThrows(IllegalArgumentException.class,
                ()->userService.addUser(0,"badsna","stha"));
    }

    @Test
    public void testaddUserWithEmptyUserName(){
        assertThrows(IllegalArgumentException.class,
                ()->userService.addUser(1,"","stha"));
    }
    @Test
    public void testaddUserWithEmptyPassword(){
        assertThrows(IllegalArgumentException.class,
                ()->userService.addUser(1,"badsna",""));
    }

    @Test
    public void testaddUserWithValidData(){
        when(userDao.addUser(anyInt(),anyString(),anyString())).thenReturn(1);
        assertEquals(1,userService.addUser(1,"sa","ads"));
    }
    @Test
    public void testupdateUserWithNoId(){
        assertThrows(IllegalArgumentException.class,
                ()->userService.updateUser(0));
    }

    @Test
    public void testupdateUserWithIdExists(){
        User user=new User(1,"badsna","sht");
        when(userDao.getById(anyInt())).thenReturn(user);
        when(userDao.updateUser(anyInt())).thenReturn(true);
        assertTrue(userService.updateUser(5));
    }

    @Test
    public void testupdateUserWithIdDonotExists(){
        when(userDao.getById(anyInt())).thenReturn(null);
        assertFalse(userService.updateUser(5));
    }

    @Test
    public void testdeleteUserWithNoId(){
        assertThrows(RuntimeException.class,
                ()->userService.deleteUser(0));
    }

    @Test
    public void testdeleteUserById(){
        User user=new User(1,"bad","stha");

        when(userDao.getById(anyInt())).thenReturn(user);
        when(userDao.deleteUser(anyInt())).thenReturn(true);
        assertTrue(userService.deleteUser(1));
    }

    @Test
    public void testdeleteUserByIdDosentExists(){
        when(userDao.getById(anyInt())).thenReturn(null);
        assertFalse(userService.deleteUser(5));
    }


    @Test
    public void testgetAllUsers(){
        User u=new User(1,"badsna","stha");
        User u1=new User(2,"st","m");

        List<User> users=new ArrayList<>();
        users.add(u);
        users.add(u1);

        when(userDao.getAllUsers()).thenReturn(users);
        assertEquals(users,userService.getAllUsers());
    }

}