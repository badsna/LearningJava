package org.example.service;

import org.example.dao.ILoginDAO;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.*;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class LoginMgmtServiceTestsAnno {

    @InjectMocks //to perform injection of other mock objects to service class
    private static ILoginMgmtServiceImpl loginMgmtService;
    @Mock //to generate mock objects
    private static ILoginDAO loginDAOMock;

    @Spy
    private static ILoginDAO loginDAOSpy;

    //both mock and spy is ready to inject so it is in confusion
    //so error
    //so manually create gardaii ramro

    //to tell they are annotation so constructor
    public LoginMgmtServiceTestsAnno() {
        //must call this method in @Before or constructor TestCase class inorder to activate Mockito annotation
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testLoginWithValidCredentials(){
        //provides  stub(temorary functionalities) for DAO's authenticate method
//        Mockito.when(loginDAOMock.authenticate("raja","rani")).thenReturn(1);

        //Instead of above there is BDD(Behavior driven development)
        //to write stub functionally accordingly agile user stories//JIRA user stories (given..when..then..)

        BDDMockito.given(loginDAOMock.authenticate("raja","rani")).willReturn(1);
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
       ILoginMgmtService loginMgmtService=new ILoginMgmtServiceImpl(loginDAOSpy);
        loginMgmtService.registerUser("raja","admin");
        loginMgmtService.registerUser("suresh","visitor");
        loginMgmtService.registerUser("jani","");

        //check the above register method calls adduser is called for 1 time internally or not for the inputs "raja,"admin"
        Mockito.verify(loginDAOSpy,Mockito.times(1)).addUser("raja","admin");
        Mockito.verify(loginDAOSpy,Mockito.times(0)).addUser("raja","visitor");
        Mockito.verify(loginDAOSpy,Mockito.never()).addUser("jani","");
    }

}
