package com.technodev.erp.users.interfaces;

import com.technodev.erp.users.entities.User;

import java.util.Date;
import java.util.List;

public interface IUser {

    User add(User user);
    User edit(User user);
    int delete(int id);
    User findById(int id);
    User findByTelephone(String phone);
    User findByEmail(String email);
    List<User> findAll();
    List<User> findByFirstname(String firstname);
    List<User> findByLastname(String lastname);
    List<User> findByStatus(String status);
    List<User> findBySexe(String sexe);
    List<User> findByDatecreation(Date date);
    List<User> findByRoles(String role);
}
