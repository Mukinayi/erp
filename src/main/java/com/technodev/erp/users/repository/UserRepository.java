package com.technodev.erp.users.repository;

import com.technodev.erp.users.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    User findByTelephone(String phone);

    User findByEmail(String email);

    List<User> findByFirstname(String firstname);

    List<User> findByLastname(String lastname);

    List<User> findByStatus(String status);

    List<User> findBySexe(String sexe);

    @Query(value = "SELECT u FROM User u WHERE u.datecreation=?1")
    List<User> findByDatecreation(Date date);

    @Modifying
    @Query(value = "DELETE FROM User u WHERE u.id=?1")
    int deletePerId(int id);
}
