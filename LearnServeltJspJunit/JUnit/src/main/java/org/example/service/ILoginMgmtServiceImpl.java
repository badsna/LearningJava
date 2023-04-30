package org.example.service;

import org.example.dao.ILoginDAO;

public class ILoginMgmtServiceImpl implements ILoginMgmtService{
    private ILoginDAO loginDAO;

    public ILoginMgmtServiceImpl(ILoginDAO loginDAO) {
        this.loginDAO = loginDAO;
    }

    @Override
    public boolean login(String username, String pwd) {
        if(username.equals("")|| pwd.equals(""))
            throw new IllegalArgumentException("empty credentials");

        //use LoginDAo
        // this method calling doesn't work so we need to do mocking for this class'
        int count= loginDAO.authenticate(username,pwd);
        if(count==0){
            return false;
        }
        else
            return true;
    }
    public String registerUser(String user,String role){
        if(!role.equalsIgnoreCase("")&& !role.equalsIgnoreCase("Visitor")){
            loginDAO.addUser(user,role);
            return "User Added";
        }
        else{
            return "User Not Added";
        }
    }
}
