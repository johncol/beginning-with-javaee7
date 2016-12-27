package com.airhacks.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Entity
@NamedQueries({ 
    @NamedQuery(name = "findAllBooks", query = "SELECT b FROM Book b"), 
    @NamedQuery(name = "findBookH2G2", query = "SELECT b FROM Book b WHERE b.title = 'H2G2'") 
})
public class Book {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String title;
    private Float price;
    @Size(min = 10, max = 2000)
    private String description;
    private String isbn;
    @Column(name = "NBOFPAGE")
    private Integer nbPgPage;
    private Boolean illustrations;
    
    public Book() {
    }

    public Book(String title, Float price, String description, String isbn, Integer nbPgPage, Boolean illustrations) {
	this.title = title;
	this.price = price;
	this.description = description;
	this.isbn = isbn;
	this.nbPgPage = nbPgPage;
	this.illustrations = illustrations;
    }

    public Book(Long id, String title, Float price, String description, String isbn, Integer nbPgPage, Boolean illustrations) {
	this.id = id;
	this.title = title;
	this.price = price;
	this.description = description;
	this.isbn = isbn;
	this.nbPgPage = nbPgPage;
	this.illustrations = illustrations;
    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getTitle() {
	return title;
    }

    public void setTitle(String title) {
	this.title = title;
    }

    public Float getPrice() {
	return price;
    }

    public void setPrice(Float price) {
	this.price = price;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    public String getIsbn() {
	return isbn;
    }

    public void setIsbn(String isbn) {
	this.isbn = isbn;
    }

    public Integer getNbPgPage() {
	return nbPgPage;
    }

    public void setNbPgPage(Integer nbPgPage) {
	this.nbPgPage = nbPgPage;
    }

    public Boolean getIllustrations() {
	return illustrations;
    }

    public void setIllustrations(Boolean illustrations) {
	this.illustrations = illustrations;
    }

    @Override
    public String toString() {
	return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

}