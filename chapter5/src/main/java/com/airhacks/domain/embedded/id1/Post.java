package com.airhacks.domain.embedded.id1;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Post {

    @EmbeddedId
    private PostId id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @Column(length = 2048)
    private String content;

    public Post() {
    }

    public Post(PostId id, Date date, String content) {
	super();
	this.id = id;
	this.date = date;
	this.content = content;
    }

    public PostId getId() {
	return id;
    }

    public void setId(PostId id) {
	this.id = id;
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
