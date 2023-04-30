package org.example.dao;

public interface ILoginDAO {
    public int authenticate(String name,String pwd);
    public int addUser(String user, String role);
}
