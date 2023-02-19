package com.example.emantranabackend.Model;

import javax.persistence.*;

@Entity
@Table(name = "Admin")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "email",nullable = false,unique = true)
    private String userId;
    @Column(name = "password",nullable = false)
    private String password;

    public Admin() {

    }

    public Admin(int id, String userId, String password) {
        this.id = id;
        this.userId = userId;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

