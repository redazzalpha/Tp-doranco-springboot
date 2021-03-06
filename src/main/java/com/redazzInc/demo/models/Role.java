/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.redazzInc.demo.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author kyzer
 */
@Entity
public class Role implements Serializable  {
    //properties
    @Id
    @Column(unique = true)
    private String roleName;
    
    //constructors
    public Role(String roleName) {
        this.roleName = roleName;
    }
    public Role() {}
    
    //setters & getters
    public String getRoleName() {
        return roleName;
    }
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
