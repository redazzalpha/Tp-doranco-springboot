/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.redazzInc.demo.services;

import com.redazzInc.demo.models.Category;
import com.redazzInc.demo.repos.CategoryRepo;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author kyzer
 */
@Service
public class CategoryService {
    //properties
    @Autowired CategoryRepo cr;
    
    //methods
    public Category create(Category u) {
        return cr.save(u);
    }
    public List<Category> readAll(Category u) {
        return cr.findAll();
    }
    public Optional<Category> readOne(Long id) {
        return cr.findById(id);
    }
    public Category readOneById(Long id) {
        return cr.getById(id);
    }
    public void remove(Category u) {
        cr.delete(u);
    }
    public void removeAll() {
        cr.deleteAll();
    }
}
