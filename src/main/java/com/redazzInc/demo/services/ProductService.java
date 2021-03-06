/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.redazzInc.demo.services;

import com.redazzInc.demo.models.Product;
import com.redazzInc.demo.repos.ProductRepo;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author kyzer
 */
@Service
public class ProductService {
    //properties
    @Autowired ProductRepo pr;
    
    //methods
    public Product create(Product u) {
        return pr.save(u);
    }
    public List<Product> readAll(Product u) {
        return pr.findAll();
    }
    public Optional<Product> readOne(Long id) {
        return pr.findById(id);
    }
    public Product readOneById(Long id) {
        return pr.getById(id);
    }
    public List<Product> readByTitle(String title) {
        return pr.findByTitle(title);
    }
    public void remove(Product u) {
        pr.delete(u);
    }
    public void removeAll() {
        pr.deleteAll();
    }
}
