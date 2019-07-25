package com.coviam.product.repository;

import com.coviam.product.entity.Category;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CategoryRepository extends MongoRepository<Category, String> {

    List<Category> findAll();

    Category insert(Category category);


}
