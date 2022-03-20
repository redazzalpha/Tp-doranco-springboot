/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.redazzInc.demo.repos;

import com.redazzInc.demo.models.Product;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author kyzer
 */
public interface ProductRepo extends JpaRepository<Product, Long> {
    // use the root "findBy"  and add property name
    //starting with uppercase to create custom service function
    //for example if class has properties: "private int age;"
    //can create function:  List<Product>findByAge(int age);"
    public List<Product> findByTitle(String title); 
}
