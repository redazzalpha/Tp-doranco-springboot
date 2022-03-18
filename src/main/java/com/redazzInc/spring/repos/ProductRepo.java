/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.redazzInc.spring.repos;

import com.redazzInc.spring.models.Category;
import com.redazzInc.spring.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author kyzer
 */
public interface ProductRepo extends JpaRepository<Product, Long> {
    
}
