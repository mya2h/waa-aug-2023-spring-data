package com.example.Lab3.repository;

import com.example.Lab3.entity.Review;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepo extends ListCrudRepository<Review,Integer> {
}
