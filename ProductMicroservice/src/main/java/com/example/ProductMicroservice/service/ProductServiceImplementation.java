package com.example.ProductMicroservice.service;

import com.example.ProductMicroservice.model.Productmodel;
import com.example.ProductMicroservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImplementation implements ProductService {


    @Autowired
    private ProductRepository productRepo;

    @Override
    public String addProduct(Productmodel product) {
        productRepo.save(product);
        return "Product added Successfully with id" + product.getProductId();
    }




    @Override
    public Productmodel findProduct(int id) {
        return productRepo.findById(id).get();
    }

    @Override
    public String deleteProduct(int id) {
        productRepo.deleteById(id);
        return "Product Deleted Successfully with id" + id;
    }


}





