package com.airhacks.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;

import org.apache.commons.lang3.builder.ToStringBuilder;

@Entity
@NamedQueries({
    @NamedQuery(name = Customer.FIND_ALL_QUERY, query = "SELECT c FROM Customer c"),
    @NamedQuery(name = Customer.FIND_BY_NAME_QUERY, query = "SELECT c FROM Customer c WHERE c.name = :name")
})
public class Customer {
    
    public final static String FIND_ALL_QUERY = "customer_find_all";
    public final static String FIND_BY_NAME_QUERY = "customer_find_by_name";

    @Id
    @GeneratedValue
    private Long id;
    
    @Version
    private Integer version;

    @NotNull
    @Column(nullable = false)
    private String name;

    @NotNull
    @OneToOne(optional = false, fetch = FetchType.LAZY, orphanRemoval = true, cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
    private Address address;

    public Customer() {
    }

    public Customer(String name, Address address) {
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
    
    @PrePersist
    @PreUpdate
    public void validateNameContent() {
	if (name == null || name.trim().length() == 0) {
	    throw new IllegalArgumentException("Name cannot be empty");
	}
    }

    @Override
    public String toString() {
	return ToStringBuilder.reflectionToString(this);
    }

}
