package org.example.service;

import org.example.dao.ILoginDAO;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ILoginMgmtServiceImplTest {

    private static ILoginMgmtService loginMgmtService;
    private static ILoginDAO loginDAOMock;

    @BeforeAll
    public  static void setupOnce(){
        //takes the class, internally generates the inMemory class implementing this interface as a dummy class
        //having null method defination for authenticate method
        loginDAOMock= Mockito.mock(ILoginDAO.class);
        System.out.println(loginDAOMock.getClass()+" "+ Arrays.toString(loginDAOMock.getClass().getInterfaces()));

        //create service class object
        //assign dao class object to service class object
        loginMgmtService=new ILoginMgmtServiceImpl(loginDAOMock);

    }

    @AfterAll
    public static void clearOnce(){
        loginDAOMock=null;
        loginMgmtService=null;
    }

    @Test
    public void testLoginWithValidCredentials(){
        //provides  stub(temorary functionalities) for DAO's authenticate method
        Mockito.when(loginDAOMock.authenticate("raja","rani")).thenReturn(1);

        //get actual result
        assertTrue(loginMgmtService.login("raja","rani"));
    }

    @Test
    public void testLoginWithInValidCredentials(){
        //provides  stub(temorary functionalities) for DAO's authenticate method
        Mockito.when(loginDAOMock.authenticate("raja","rani1")).thenReturn(0);


        //get actual result
        assertFalse(loginMgmtService.login("raja","rani1"));
    }

    @Test
    public void testLoginWithNoCredentials(){
        assertThrows(IllegalArgumentException.class,
                ()->loginMgmtService.login("",""));
    }

    @Test
    public void testRegisterWithSpy(){
        ILoginDAO loginDAOSpy=Mockito.spy(ILoginDAO.class);
        ILoginMgmtService loginMgmtService1=new ILoginMgmtServiceImpl(loginDAOSpy);
        loginMgmtService1.registerUser("raja","admin");
        loginMgmtService1.registerUser("suresh","visitor");
        loginMgmtService1.registerUser("jani","");

        //check the above register method calls adduser is called for 1 time internally or not for the inputs "raja,"admin"
    Mockito.verify(loginDAOSpy,Mockito.times(1)).addUser("raja","admin");
        Mockito.verify(loginDAOSpy,Mockito.times(0)).addUser("raja","visitor");
        Mockito.verify(loginDAOSpy,Mockito.never()).addUser("jani","");




    }

}