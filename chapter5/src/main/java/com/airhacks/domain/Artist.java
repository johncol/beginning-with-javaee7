package com.airhacks.domain;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import java.time.temporal.ChronoUnit;

public class Artist {

    @Column(nullable = false, unique = true)
    private String name;

    @Temporal(TemporalType.DATE)
    private Date birthdate;

    @Transient
    private Integer age;

    public Artist() {
    }

    public Artist(String name, Date birthdate) {
	this.name = name;
	this.birthdate = birthdate;
	this.age = (int) ChronoUnit.YEARS.between(LocalDate.now(), LocalDate.ofEpochDay(birthdate.getTime()));
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public Date getBirthdate() {
	return birthdate;
    }

    public void setBirthdate(Date birthdate) {
	this.birthdate = birthdate;
    }

    public Integer getAge() {
	return age;
    }

    public void setAge(Integer age) {
	this.age = age;
    }

}
