package com.airhacks.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.SecondaryTables;
import javax.persistence.Table;

@Entity
@Table(name = "t_address")
@SecondaryTables({
    @SecondaryTable(name = "t_city"),
    @SecondaryTable(name = "t_country") 
})
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String id;

    private String street1;

    private String street2;

    @Column(table = "t_city")
    private String city;

    @Column(table = "t_city")
    private String zipCode;

    @Column(table = "t_country")
    private String country;
    
    public Address() {
    }

    public Address(String id, String street1, String street2, String city, String zipCode, String country) {
	this.id = id;
	this.street1 = street1;
	this.street2 = street2;
	this.city = city;
	this.zipCode = zipCode;
	this.country = country;
    }

    public String getId() {
	return id;
    }

    public void setId(String id) {
	this.id = id;
    }

    public String getStreet1() {
	return street1;
    }

    public void setStreet1(String street1) {
	this.street1 = street1;
    }

    public String getStreet2() {
	return street2;
    }

    public void setStreet2(String street2) {
	this.street2 = street2;
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

    public String getCountry() {
	return country;
    }

    public void setCountry(String country) {
	this.country = country;
    }

}
