package com.lhso.desafiopicpay.project.core.entities.User;

import java.util.UUID;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;


    private UserWallet wallet;

    private UserType type;

    private String fullName;

    private String document;

    private String email;

    private String password;

    public User() {

    }

    public User(UserType type, UserWallet wallet, String fullName, String document, String email, String password) {
        this.wallet = wallet;
        this.type = type;
        this.fullName = fullName;
        this.document = document;
        this.email = email;
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public UserWallet getWallet() {
        return wallet;
    }

    public String getDocument() {
        return document;
    }

    public String getEmail() {
        return email;
    }

    public String getFullName() {
        return fullName;
    }

    public UUID getId() {
        return id;
    }
}
