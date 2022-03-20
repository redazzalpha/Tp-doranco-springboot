/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.redazzInc.spring.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

/**
 *
 * @author kyzer
 */
@Entity
public class User implements Serializable {
    //properties
    @Id
    @Column(unique = true)
    private String username;
    private int active;
    @Column(nullable = false)
    private String password;
    
    //relationships
    @ManyToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinColumn(name = "test")
    private List<Role> roles;
    
    //constructors
    public User(String username, int active, String password, List<Role> roles) {
        this.username = username;
        this.active = active;
        this.password = password;
        this.roles = roles;
    }
    public User(String username, int active, String password) {
        this.username = username;
        this.active = active;
        this.password = password;
    }
    public User() {}
    
    //setters & getters
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public int getActive() {
        return active;
    }
    public void setActive(int active) {
        this.active = active;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public List<Role> getRoles() {
        return roles;
    }
    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
    public void addRole(Role role) {
        this.roles.add(role);
    }
}
