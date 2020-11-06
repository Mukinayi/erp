package com.technodev.erp.users.services;

import com.technodev.erp.users.entities.Role;
import com.technodev.erp.users.entities.User;
import com.technodev.erp.users.interfaces.IUser;
import com.technodev.erp.users.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class UserService implements IUser {

    @Autowired
    private UserRepository repository;


    @Override
    public User add(User user) {
        if(isExist(user.getEmail(),user.getTelephone())){
            throw new RuntimeException("Cet email ou ce téléphone existe déjà");
        }
        return repository.save(user);
    }

    @Override
    public User edit(User user) {
        return repository.save(user);
    }

    @Override
    public int delete(int id) {
        return repository.deletePerId(id);
    }

    @Override
    public User findById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public User findByTelephone(String phone) {
        return repository.findByTelephone(phone);
    }

    @Override
    public User findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public List<User> findByFirstname(String firstname) {
        return repository.findByFirstname(firstname);
    }

    @Override
    public List<User> findByLastname(String lastname) {
        return repository.findByLastname(lastname);
    }

    @Override
    public List<User> findByStatus(String status) {
        return repository.findByStatus(status);
    }

    @Override
    public List<User> findBySexe(String sexe) {
        return repository.findBySexe(sexe);
    }

    @Override
    public List<User> findByDatecreation(Date date) {
        return repository.findByDatecreation(date);
    }

    @Override
    public List<User> findByRoles(String role) {
        return new ArrayList<>();
    }

    @Override
    public boolean isExist(String email, String phone) {
        if(findByEmail(email)!=null){
            return true;
        }

        if(findByTelephone(phone)!=null){
            return true;
        }
        return false;
    }
}
