package com.airhacks.domain.relationship;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.OrderBy;

@Entity
public class Customer {

    @Id @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;

    @OneToOne
    @JoinColumn(name = "address_id", nullable = false)
    private Address address;
    
    @OneToMany
    @JoinColumn(name = "customer_id")
    @OrderBy("number ASC")
    private List<CreditCard> cards = new ArrayList<>();

    public Customer() {
    }

    public Customer(Long id, String name, Address address) {
	this.id = id;
	this.name = name;
	this.address = address;
    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public Address getAddress() {
	return address;
    }

    public void setAddress(Address address) {
	this.address = address;
    }

}
