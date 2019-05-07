package com.javaorders.demo.controller;

import com.javaorders.demo.model.Customers;
import com.javaorders.demo.model.Orders;
import com.javaorders.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/project")
public class CustomerController
{
    @Autowired
    private CustomerService customerService;

    // http://localhost:2021/project/customer/order
    @GetMapping(value = "/customer/order", produces = {"application/json"})
    public ResponseEntity<?> listAllCustWithOrders()
    {
        List<Customers> myCustomers = customerService.findAll();
        return new ResponseEntity<>(myCustomers, HttpStatus.OK);
    }
}
