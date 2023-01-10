package com.example.ProductMicroservice.repository;

import com.example.ProductMicroservice.model.Productmodel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<Productmodel,Integer> {


}
