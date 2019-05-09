package com.javaorders.demo.service;

import com.javaorders.demo.model.Customers;
import com.javaorders.demo.model.Orders;

import java.util.List;

public interface CustomerService
{
    List<Customers> findAll();

    List<Orders> findAllOrdersByName(String name);

    void delete(long custCode);

    Customers save(Customers customer);

    Customers update(Customers customer, long custCode);
}
