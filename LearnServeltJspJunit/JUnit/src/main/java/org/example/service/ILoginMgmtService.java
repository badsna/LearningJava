package org.example.service;

public interface ILoginMgmtService {
    public boolean login(String username,String pwd);
    public String registerUser(String user,String role);
    }
