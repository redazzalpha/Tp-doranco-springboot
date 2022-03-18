/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.redazzInc.spring.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 *
 * @author kyzer
 */
@Entity
public class User implements Serializable {
    //properties
    @Id
    private String username;
    @Column(nullable = false)
    private String passwd;
    private int active;
    
    //relationships
    @ManyToMany
    @JoinTable(
        name = "user_roles", 
        joinColumns = @JoinColumn(name = "username"), 
        inverseJoinColumns = @JoinColumn(name = "role_name")
    )
    private List<Role> roles = new ArrayList<Role>();
    
    //constructors
    public User(String username, String passwd, int active, List<Role> roles) {
        this.username = username;
        this.passwd = passwd;
        this.active = active;
        this.roles = roles;
    }
    public User() {}
    
    //getters & setters
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPasswd() {
        return passwd;
    }
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
    public int getActive() {
        return active;
    }
    public void setActive(int active) {
        this.active = active;
    }
    public List<Role> getRoles() {
        return roles;
    }
    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
