package com.coviam.product.repository;

import com.coviam.product.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProductRepository extends MongoRepository<Product, Long> {

    List<Product> findByCategory(String categoryName);
}
