package com.company.impl;

import com.company.MyException.*;
import com.company.dao.*;
import com.company.model.*;
import com.company.service.*;

import java.util.List;

public class ImplServiceUser implements UserService {
    private  final UserDao userDaos = new UserDao();


    public List<User> getAll() {
        return userDaos.getUsers();
    }
    @Override
    public void addUser(User user) {
        List<User> users = userDaos.getUsers();
        users.add(user);
    }

    @Override
    public User getById(int id)  {

        return userDaos.getUsers()
                .stream()
                .filter(user -> user.getId()  == id)
                .findFirst().orElseThrow(() -> new MyException( " not by id "));

    }




    @Override
    public User removeUser(int id) {

        User user1 = userDaos.getUsers().stream().filter(user -> user.getId() == id)
                .findFirst().orElseThrow(()-> new MyException("Удалит кылына турган усер табылган жок"));
        userDaos.getUsers().remove(user1);
        return user1;
    }


    @Override
    public String toString() {
        return "ImplServiceUser:" +
                "userDaos=" + userDaos ;
    }
}
