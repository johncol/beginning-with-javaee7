package com.airhacks.domain.embedded;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ShippingAddress {

    private String city;

    @Column(name = "zip_code")
    private String zipCode;

    @Column(length = 512)
    private String street;

    public ShippingAddress() {
    }

    public ShippingAddress(String city, String zipCode, String street) {
	this.city = city;
	this.zipCode = zipCode;
	this.street = street;
    }

    public String getCity() {
	return city;
    }

    public void setCity(String city) {
	this.city = city;
    }

    public String getZipCode() {
	return zipCode;
    }

    public void setZipCode(String zipCode) {
	this.zipCode = zipCode;
    }

    public String getStreet() {
	return street;
    }

    public void setStreet(String street) {
	this.street = street;
    }

}
