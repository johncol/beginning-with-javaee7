package com.airhacks.domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Access(AccessType.PROPERTY)
public class CD {

    private Long id;
    private String title;
    private String description;

    public CD() {
    }

    public CD(Long id, String title, String description) {
	this.id = id;
	this.title = title;
	this.description = description;
    }

    @Id
    @GeneratedValue
    public Long getId() {
	return id;
    }
    public void setId(Long id) {
	this.id = id;
    }

    @Column(unique = true, nullable = false)
    public String getTitle() {
	return title;
    }
    public void setTitle(String title) {
	this.title = title;
    }

    public String getDescription() {
	return description;
    }
    public void setDescription(String description) {
	this.description = description;
    }

}
