package com.company.dao;

import com.company.model.*;

import java.util.ArrayList;
import java.util.List;
public class UserDao {

   private final List<User> users = new ArrayList<>();

    public List<User> getUsers() {
        return users;
    }

    @Override
    public String
    toString() {
        return "UserDao:" +
                "users=" + users ;
    }
}
