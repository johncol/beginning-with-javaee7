package com.airhacks.domain.embedded;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class ShoppingOrder {

    @Id
    private Long id;

    @Column(nullable = false)
    private String customer;

    @Temporal(TemporalType.DATE)
    private String date;

    @Embedded
    private ShippingAddress shippingAddress;

    public ShoppingOrder() {
    }

    public ShoppingOrder(Long id, String customer, String date, ShippingAddress shippingAddress) {
	this.id = id;
	this.customer = customer;
	this.date = date;
	this.shippingAddress = shippingAddress;
    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getCustomer() {
	return customer;
    }

    public void setCustomer(String customer) {
	this.customer = customer;
    }

    public String getDate() {
	return date;
    }

    public void setDate(String date) {
	this.date = date;
    }

    public ShippingAddress getShippingAddress() {
	return shippingAddress;
    }

    public void setShippingAddress(ShippingAddress shippingAddress) {
	this.shippingAddress = shippingAddress;
    }

}
