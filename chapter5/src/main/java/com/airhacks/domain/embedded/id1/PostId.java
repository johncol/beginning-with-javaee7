package com.airhacks.domain.embedded.id1;

import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Embeddable
public class PostId {

    private String title;
    private String language;

    public PostId() {
    }

    public PostId(String title, String language) {
	this.title = title;
	this.language = language;
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
    
    @Override
    public boolean equals(Object obj) {
	if (!(obj instanceof PostId)) return false;
	PostId other = (PostId) obj;
        return new EqualsBuilder()
        	.append(this.title, other.title)
        	.append(this.language, other.language)
        	.build();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder()
        	.append(this.title)
        	.append(this.language)
        	.build();
    }

}
