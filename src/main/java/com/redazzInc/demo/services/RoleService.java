/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.redazzInc.demo.services;

import com.redazzInc.demo.models.Role;
import com.redazzInc.demo.repos.RoleRepo;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author kyzer
 */
@Service
public class RoleService {
    //properties
    @Autowired RoleRepo rr;
    
    //methods
    public Role create(Role u) {
        return rr.save(u);
    }
    public List<Role> readAll(Role u) {
        return rr.findAll();
    }
    public Optional<Role> readOne(String id) {
        return rr.findById(id);
    }
    public Role readOneById(String id) {
        return rr.getById(id);
    }
    public void remove(Role u) {
        rr.delete(u);
    }
    public void removeAll() {
        rr.deleteAll();
    }
}
