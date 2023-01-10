package com.example.ProductMicroservice.controller;

import com.example.ProductMicroservice.model.Productmodel;
import com.example.ProductMicroservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/productdetails")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/add")
    public String addProduct(@RequestBody Productmodel product) {
        return productService.addProduct(product) ;
    }



    @GetMapping("/find/{id}")
    public Productmodel findProduct(@PathVariable int id) {
        return productService.findProduct(id);
    }



    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        return productService.deleteProduct(id);
    }




}



