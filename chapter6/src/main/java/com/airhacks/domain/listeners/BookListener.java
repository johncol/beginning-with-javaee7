package com.airhacks.domain.listeners;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import com.airhacks.domain.Book;

public class BookListener {
    
    @PrePersist
    @PreUpdate
    public void validateIsbn(Book book) {
	if (book.getIsbn().equals("00-0000-00000")) {
	    throw new IllegalArgumentException("Invalid isbn");
	}
    }

}
