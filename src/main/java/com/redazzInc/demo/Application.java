package com.redazzInc.demo;

import com.redazzInc.demo.enums.Delivery;
import com.redazzInc.demo.models.Category;
import com.redazzInc.demo.models.Product;
import com.redazzInc.demo.services.CategoryService;
import com.redazzInc.demo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {
    //properties
    @Autowired CategoryService cs;
    @Autowired ProductService ps;
    
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args); 
    }

    @Override
    public void run(String... args) {
        //create categories
        Category category = new Category("First category");
        Category category1 = new Category("Second category");
        Category category2 = new Category("Third category");
        Category category3 = new Category("Fouth category");
        
        //create products
        Product product = new Product("Title first product", "Description first product", Delivery.yes);
        Product product1 = new Product("Title second product", "Description second product", Delivery.no);
        Product product2 = new Product("Title third product", "Description third product", Delivery.yes);
        Product product3 = new Product("Title fourth product", "Description fourth product", Delivery.no);
        
        //add  category to product
        category.addProduct(product);
        category.addProduct(product3);

        category2.addProduct(product);
        category2.addProduct(product2);

        category1.addProduct(product2);
        category1.addProduct(product3);

        //create products into database
        ps.create(product);
        ps.create(product1);
        ps.create(product2);
        ps.create(product3);

        //create categories into database
        cs.create(category);
        cs.create(category1);
        cs.create(category2);
        cs.create(category3);
        
        
        for(Product p : ps.readByTitle("Title fourth product"))
            System.out.println("++++++++++++++++++++++ " + p);
        
        
    }
}
