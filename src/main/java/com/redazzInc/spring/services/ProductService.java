/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.redazzInc.spring.services;

import com.redazzInc.spring.models.Product;
import com.redazzInc.spring.repos.ProductRepo;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author kyzer
 */
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
    public void remove(Product u) {
        pr.delete(u);
    }
    public void removeAll() {
        pr.deleteAll();
    }
}
