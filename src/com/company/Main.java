package com.company;

import com.company.model.*;
import com.company.impl.ImplServiceUser;

public class Main {
    public static void main(String[] args) throws Exception {

        User user1 = new User(1,"Zarip",20, Gender.MAN);
        User user2 = new User(2,"Zuh",20, Gender.MAN);
        User user3 = new User(3,"Timur",20, Gender.MAN);

      try {
          ImplServiceUser implServiceUser = new ImplServiceUser();

        implServiceUser.addUser(user1);
        implServiceUser.addUser(user3);
        implServiceUser.addUser(user2);




        System.out.println("Siz chakyrgan User--> "+ implServiceUser.getById(2));                      //айди менен чакыруу
        System.out.println(implServiceUser.getAll());
        System.out.println("Udalit bolgon User: "+(implServiceUser.removeUser(3)));     //айди менен очуруу
        System.out.println(implServiceUser.getAll());
    }catch (RuntimeException e){
          System.out.println(e.getMessage());
      }


    }
}