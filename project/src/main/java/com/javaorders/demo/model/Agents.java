package com.javaorders.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "agent")
public class Agents
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private long agentCode;

    @Column(unique = true,
    nullable = false)
    private String agentName;

    private String workingArea;
    private double commission;
    private String phone;
    private String country;

    @OneToMany(mappedBy = "agent")
    @JsonIgnoreProperties("agent")
    private List<Customers> customers = new ArrayList<>();


    public Agents()
    {
    }

    public Agents(String agentName, String workingArea, double commission, String phone, String country)
    {
        this.agentName = agentName;
        this.workingArea = workingArea;
        this.commission = commission;
        this.phone = phone;
        this.country = country;
    }

    public long getAgentCode()
    {
        return agentCode;
    }

    public void setAgentCode(long agentCode)
    {
        this.agentCode = agentCode;
    }

    public String getAgentName()
    {
        return agentName;
    }

    public void setAgentName(String agentName)
    {
        this.agentName = agentName;
    }

    public List<Customers> getCustomers()
    {
        return customers;
    }

    public String getWorkingArea()
    {
        return workingArea;
    }

    public void setWorkingArea(String workingArea)
    {
        this.workingArea = workingArea;
    }

    public double getCommission()
    {
        return commission;
    }

    public void setCommission(double commission)
    {
        this.commission = commission;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public String getCountry()
    {
        return country;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }
}
