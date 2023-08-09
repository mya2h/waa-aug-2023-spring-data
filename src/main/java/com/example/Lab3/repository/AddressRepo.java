package com.example.Lab3.repository;

import com.example.Lab3.entity.Address;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepo extends ListCrudRepository<Address,Integer> {
}