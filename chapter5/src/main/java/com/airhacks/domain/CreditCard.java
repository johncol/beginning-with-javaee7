package com.airhacks.domain;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity
public class CreditCard {

    @Id
    private String number;

    private String expiryDate;

    private Integer controlNumber;

    @Enumerated(EnumType.STRING)
    private CreditCardType creditCardType;

    public CreditCard() {
    }

    public CreditCard(String number, String expiryDate, Integer controlNumber, CreditCardType creditCardType) {
	this.number = number;
	this.expiryDate = expiryDate;
	this.controlNumber = controlNumber;
	this.creditCardType = creditCardType;
    }
    
    public String getNumber() {
	return number;
    }

    public void setNumber(String number) {
	this.number = number;
    }

    public String getExpiryDate() {
	return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
	this.expiryDate = expiryDate;
    }

    public Integer getControlNumber() {
	return controlNumber;
    }

    public void setControlNumber(Integer controlNumber) {
	this.controlNumber = controlNumber;
    }

    public CreditCardType getCreditCardType() {
	return creditCardType;
    }

    public void setCreditCardType(CreditCardType creditCardType) {
	this.creditCardType = creditCardType;
    }

}
