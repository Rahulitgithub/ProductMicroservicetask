package com.example.ProductMicroservice.service;

import com.example.ProductMicroservice.model.Productmodel;

import java.util.List;

public interface ProductService {
    public String addProduct(Productmodel product);

    public Productmodel findProduct(int id);
    public String deleteProduct(int id);

}
