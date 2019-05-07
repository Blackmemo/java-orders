package com.javaorders.demo.repos;


import com.javaorders.demo.model.Customers;
import org.springframework.data.repository.CrudRepository;

public interface CustomersRepository extends CrudRepository<Customers, Long>
{
}
