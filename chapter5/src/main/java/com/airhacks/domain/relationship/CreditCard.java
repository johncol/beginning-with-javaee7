package com.airhacks.domain.relationship;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class CreditCard {

    @Id
    private String id;

    @Column(nullable = false)
    private String number;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    public CreditCard() {
    }

    public CreditCard(String id, String number, Customer customer) {
	this.id = id;
	this.number = number;
	this.customer = customer;
    }

    public String getId() {
	return id;
    }

    public void setId(String id) {
	this.id = id;
    }

    public String getNumber() {
	return number;
    }

    public void setNumber(String number) {
	this.number = number;
    }

    public Customer getCustomer() {
	return customer;
    }

    public void setCustomer(Customer customer) {
	this.customer = customer;
    }

}
