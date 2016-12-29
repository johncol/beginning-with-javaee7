package com.airhacks.domain.embedded.id2;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@IdClass(PostId.class)
public class Post {

    @Id
    private String title;
    @Id
    private String language;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @Column(length = 2048)
    private String content;

    public Post() {
    }

    public Post(String title, String language, Date date, String content) {
	this.title = title;
	this.language = language;
	this.date = date;
	this.content = content;
    }

    public String getTitle() {
	return title;
    }

    public void setTitle(String title) {
	this.title = title;
    }

    public String getLanguage() {
	return language;
    }

    public void setLanguage(String language) {
	this.language = language;
    }

    public Date getDate() {
	return date;
    }

    public void setDate(Date date) {
	this.date = date;
    }

    public String getContent() {
	return content;
    }

    public void setContent(String content) {
	this.content = content;
    }

}
