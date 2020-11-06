package com.technodev.erp.users.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 50)
    private String firstname;
    @Column(length = 50)
    private String lastname;
    @Column(length = 3, nullable = false)
    private String sexe;
    @Column(length = 13, nullable=true, unique = true)
    private String telephone;
    @Column(length = 100, nullable = false)
    private String adresse;
    @Column(length = 60,nullable = false, unique = true)
    private String email;
    @Column(length = 128, nullable = false)
    private String password;
    @Column(length = 4, nullable = false)
    private String status;
    @Temporal(TemporalType.DATE)
    private Date datecreation;
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
    private List<Role> roles;

    public User() {
    }

    public User(String firstname, String lastname, String sexe, String telephone, String adresse, String email, String password, String status, Date datecreation, List<Role> roles) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.sexe = sexe;
        this.telephone = telephone;
        this.adresse = adresse;
        this.email = email;
        this.password = password;
        this.status = status;
        this.datecreation = datecreation;
        this.roles = roles;
    }

    public User(int id, String firstname, String lastname, String sexe, String telephone, String adresse, String email, String password, String status, Date datecreation, List<Role> roles) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.sexe = sexe;
        this.telephone = telephone;
        this.adresse = adresse;
        this.email = email;
        this.password = password;
        this.status = status;
        this.datecreation = datecreation;
        this.roles = roles;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDatecreation() {
        return datecreation;
    }

    public void setDatecreation(Date datecreation) {
        this.datecreation = datecreation;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", sexe='" + sexe + '\'' +
                ", telephone='" + telephone + '\'' +
                ", adresse='" + adresse + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", status='" + status + '\'' +
                ", datecreation=" + datecreation +
                '}';
    }
}
