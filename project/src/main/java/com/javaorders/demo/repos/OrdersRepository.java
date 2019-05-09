package com.javaorders.demo.repos;

import com.javaorders.demo.model.Customers;
import com.javaorders.demo.model.Orders;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrdersRepository extends CrudRepository<Orders, Long>
{
}
