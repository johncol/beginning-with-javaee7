package com.airhacks.services;

import static org.junit.Assert.*;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.Test;

import com.airhacks.domain.Book;

public class BookServiceIT {
	
	@Test
	public void shouldCheckNumberIsMock() {
		Weld weld = new Weld();
		WeldContainer container = weld.initialize();
		BookService bookService = container.instance().select(BookService.class).get();
		Book book = bookService.createBook("Sample 1", 5F, "sample book");
		assertTrue(book.getNumber().toLowerCase().startsWith("mock"));
		weld.shutdown();
	}

}
