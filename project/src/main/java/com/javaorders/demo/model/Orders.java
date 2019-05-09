package com.javaorders.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Orders
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private long ordNum;

    private double ordAmount;
    private double advanceAmount;

    @ManyToOne
    @JoinColumn(name = "custCode")
    private Customers customer;
    @ManyToOne
    @JoinColumn(name = "agentCode")
    private Agents agentCode;

    private String ordDescription;

    public Orders()
    {
    }

    public Orders(double ordAmount, double advanceAmount, Customers customer, Agents agentCode, String ordDescription)
    {
        this.ordAmount = ordAmount;
        this.advanceAmount = advanceAmount;
        this.customer = customer;
        this.agentCode = agentCode;
        this.ordDescription = ordDescription;
    }

    public long getOrdNum()
    {
        return ordNum;
    }

    public void setOrdNum(long ordNum)
    {
        this.ordNum = ordNum;
    }

    public double getOrdAmount()
    {
        return ordAmount;
    }

    public void setOrdAmount(double ordAmount)
    {
        this.ordAmount = ordAmount;
    }

    public double getAdvanceAmount()
    {
        return advanceAmount;
    }

    public void setAdvanceAmount(double advanceAmount)
    {
        this.advanceAmount = advanceAmount;
    }

    public Customers getCustomer()
    {
        return customer;
    }

    public void setCustomer(Customers customer)
    {
        this.customer = customer;
    }

    public Agents getAgentCode()
    {
        return agentCode;
    }

    public void setAgentCode(Agents agentCode)
    {
        this.agentCode = agentCode;
    }

    public String getOrdDescription()
    {
        return ordDescription;
    }

    public void setOrdDescription(String ordDescription)
    {
        this.ordDescription = ordDescription;
    }
}
