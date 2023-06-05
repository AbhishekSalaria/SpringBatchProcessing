package com.batchprocessing.springbatchprocessing.repository;

import com.batchprocessing.springbatchprocessing.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {

}
