package com.company.service;

import com.company.model.*;

import java.util.List;

public interface UserService {

    List<User> getAll();
    User getById (int id) throws Exception;
    void addUser(User user);
    User removeUser(int id);

}
