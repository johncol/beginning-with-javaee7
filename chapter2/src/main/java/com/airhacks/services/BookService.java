package com.airhacks.services;

import javax.inject.Inject;

import com.airhacks.annotations.bindings.Loggable;
import com.airhacks.annotations.qualifiers.ThirteenDigits;
import com.airhacks.domain.Book;
import com.airhacks.services.generator.NumberGenerator;

@Loggable
public class BookService {
	
	@Inject @ThirteenDigits
	private NumberGenerator numberGenerator;
	
	public Book createBook(String title, Float price, String description) {
		String number = numberGenerator.generate();
		Book book = new Book(number, title, price, description);
		return book;
	}

}
