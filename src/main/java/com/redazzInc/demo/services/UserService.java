/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.redazzInc.demo.services;

import com.redazzInc.demo.models.User;
import com.redazzInc.demo.repos.UserRepo;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author kyzer
 */
@Service
public class UserService {
    //properties
    @Autowired UserRepo ur;
    
    //methods
    public User create(User u) {
        return ur.save(u);
    }
    public List<User> readAll(User u) {
        return ur.findAll();
    }
    public Optional<User> readOne(String id) {
        return ur.findById(id);
    }
    public User readOneById(String id) {
        return ur.getById(id);
    }
    public void remove(User u) {
        ur.delete(u);
    }
    public void removeAll() {
        ur.deleteAll();
    }
}
