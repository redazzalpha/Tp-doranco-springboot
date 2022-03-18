/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.redazzInc.spring.repos;

import com.redazzInc.spring.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author kyzer
 */
public interface UserRepo extends JpaRepository<Category, Long> {
    
}
