package com.airhacks.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "t_book")
public class Book {

    @Id
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(updatable = false)
    private String author;

    @Column(unique = true, insertable = false)
    private String isbn;

    @Column(name = "nb_of_pages")
    private Integer nbOfPages;
    
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] pdf;
    
    public Book() {
    }

    public Book(Long id, String title, String author, String isbn, Integer nbOfPages, byte[] pdf) {
	this.id = id;
	this.title = title;
	this.author = author;
	this.isbn = isbn;
	this.nbOfPages = nbOfPages;
	this.pdf = pdf;
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

    public String getAuthor() {
	return author;
    }

    public void setAuthor(String author) {
	this.author = author;
    }

    public String getIsbn() {
	return isbn;
    }

    public void setIsbn(String isbn) {
	this.isbn = isbn;
    }

    public Integer getNbOfPages() {
	return nbOfPages;
    }

    public void setNbOfPages(Integer nbOfPages) {
	this.nbOfPages = nbOfPages;
    }
    
    public byte[] getPdf() {
	return pdf;
    }
    
    public void setPdf(byte[] pdf) {
	this.pdf = pdf;
    }

}
