package com.technodev.erp.users.repository;

import com.technodev.erp.users.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

    Role findByRole(String role);

    @Modifying
    @Query(value = "DELETE FROM Role r WHERE r.id=?1")
    int deletePerId(int id);
}
