package com.airhacks.domain.inheritance;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class SmartPhone extends Item {

    private String gamma;

    @Temporal(TemporalType.DATE)
    private Date releaseDate;

    private String os;

    public SmartPhone() {
    }

    public SmartPhone(String gamma, Date releaseDate, String os) {
	this.gamma = gamma;
	this.releaseDate = releaseDate;
	this.os = os;
    }

    public String getGamma() {
	return gamma;
    }

    public void setGamma(String gamma) {
	this.gamma = gamma;
    }

    public Date getReleaseDate() {
	return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
	this.releaseDate = releaseDate;
    }

    public String getOs() {
	return os;
    }

    public void setOs(String os) {
	this.os = os;
    }

}
