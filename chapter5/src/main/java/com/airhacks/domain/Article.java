package com.airhacks.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Article {

    @Id
    private Long id;

    private String title;

    @ElementCollection
    @CollectionTable(name = "Tags")
    @Column(name = "tag_name")
    private List<String> tags = new ArrayList<>();

    public Article() {
    }

    public Article(Long id, String title, List<String> tags) {
	this.id = id;
	this.title = title;
	this.tags = tags;
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

    public List<String> getTags() {
	return tags;
    }

    public void setTags(List<String> tags) {
	this.tags = tags;
    }

}
