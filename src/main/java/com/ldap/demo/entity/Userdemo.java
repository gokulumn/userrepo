package com.ldap.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "DemoUsers")
public class Userdemo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer iden;

    private String Firstname;
    private String Lastname;
    private String email;

    // No-argument constructor
    public Userdemo() {
    }

    // All-argument constructor (optional, for convenience)
    public Userdemo(String firstname, String lastname, String email) {
        this.Firstname = firstname;
        this.Lastname = lastname;
        this.email = email;
    }



    // Getters and setters
    public Integer getId() {
        return iden;
    }

    public void setId(Integer iden) {
        this.iden = iden;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        this.Firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        this.Lastname = lastname;
    }

    public String getEmail() {
        return email;
    }
}