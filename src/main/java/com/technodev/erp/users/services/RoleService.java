package com.technodev.erp.users.services;

import com.technodev.erp.users.entities.Role;
import com.technodev.erp.users.interfaces.IRole;
import com.technodev.erp.users.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService implements IRole {

    @Autowired
    private RoleRepository repository;

    @Override
    public Role add(Role role) {
        if(isExist(role.getRole())){
            throw new RuntimeException("Ce role existe déjà");
        }
        return repository.save(role);
    }

    @Override
    public Role edit(Role role) {
        return repository.save(role);
    }

    @Override
    public int delete(int id) {
        return repository.deletePerId(id);
    }

    @Override
    public Role findById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Role findByRole(String role) {
        return repository.findByRole(role);
    }

    @Override
    public List<Role> findAll() {
        return repository.findAll();
    }

    @Override
    public boolean isExist(String role) {
        Role ro = findByRole(role);
        if(ro!=null){
            return true;
        }
        return false;
    }
}
