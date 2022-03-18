/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.redazzInc.spring.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author kyzer
 */
@Entity
public class Role implements Serializable {
    //properties
    @Id
    private String role_name;
    
    //relationships
    @ManyToMany(mappedBy = "roles")
    private List<User> users = new ArrayList<User>();
    
    //constructors
    public Role(String role_name) {
        this.role_name = role_name;
    }
    public Role() {}
    
    //getters & setters
    public String getRole_name() {
        return role_name;
    }
    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }
    public List<User> getUsers() {
        return users;
    }
    public void setUsers(List<User> users) {
        this.users = users;
    }
    
    //methods
    @Override
    public String toString() {
        return "Role{" + "role_name=" + role_name + ", users=" + users + '}';
    }
}
