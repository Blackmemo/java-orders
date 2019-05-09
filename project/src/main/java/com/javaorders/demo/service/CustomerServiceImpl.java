package com.javaorders.demo.service;

import com.javaorders.demo.model.Customers;
import com.javaorders.demo.model.Orders;
import com.javaorders.demo.repos.CustomersRepository;
import com.javaorders.demo.repos.OrdersRepository;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service(value = "customerService")
public class CustomerServiceImpl implements CustomerService
{
    @Autowired
    private CustomersRepository custrepos;
    private OrdersRepository ordsrepo;

    @Override
    public List<Customers> findAll()
    {
        ArrayList<Customers> list = new ArrayList<>();
        custrepos.findAll().iterator().forEachRemaining(list::add);
        return list;
    }

    @Override
    public List<Orders> findAllOrdersByName(String name) throws EntityNotFoundException
    {
        ArrayList<Orders> list = new ArrayList<>();
        return list;
    }

    @Override
    public void delete(long custCode) throws EntityNotFoundException
    {

    if (custrepos.findById(custCode).isPresent())
        {
            custrepos.deleteById(custCode);
        } else
        {
            throw new EntityNotFoundException(Long.toString(custCode));
        }
    }

    @Transactional
    @Override
    public Customers save(Customers customer)
    {
        Customers newCustomer = new Customers();

        newCustomer.setCustName(customer.getCustName());
        newCustomer.setCustCity(customer.getCustCity());
        newCustomer.setCustCountry(customer.getCustCountry());
        newCustomer.setPhone(customer.getPhone());
        newCustomer.setWorkingArea(customer.getWorkingArea());
        newCustomer.setGrade(customer.getGrade());
        newCustomer.setOpeningAmt(customer.getOpeningAmt());
        newCustomer.setOutstandingAmt(customer.getOutstandingAmt());
        newCustomer.setReceiveAmt(customer.getReceiveAmt());
        newCustomer.setPaymentAmt(customer.getPaymentAmt());

        return custrepos.save(newCustomer);
    }

    @Transactional
    @Override
    public Customers update(Customers customer, long custCode)
    {
        return null;
    }
}
