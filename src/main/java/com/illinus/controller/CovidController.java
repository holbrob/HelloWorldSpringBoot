package com.illinus.controller;
 
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.illinus.service.CovidService;
import com.illinus.vo.Product;
 
@RestController
public class CovidController {
	
	CovidService covidService = new CovidService();
 
    @RequestMapping("/hello")
    public String hello(@RequestParam(name = "name", defaultValue = "World") String name) {
        return "Hello " + name;
    }
    
    @GetMapping(value = "/getproduct", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Product getProduct() {
        return new Product(1, "iPhone", 999.99f);
    }
    
    @GetMapping("/products/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable int id) {
        // find the product by id
    	Product productObject = getProduct();
    	boolean found = true;
         
    	
        if (found) {
            return new ResponseEntity<Product>(productObject, HttpStatus.OK);
        } else {       
            return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
        }
    }
    
    @PostMapping("/addproduct")
    public void addProduct(@RequestBody Product product) {
        System.out.println(product);
    }
    
    @PostMapping(value = "/update", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public void updateProduct(@RequestBody Product product) {
        System.out.println(product);
    }
    
    @GetMapping(value = "/states", produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<String> getStates() {
        return covidService.getStates();
    }
}
