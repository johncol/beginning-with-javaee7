package com.airhacks;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import com.airhacks.domain.Book;
import com.airhacks.services.BookService;

public class Application {
	
	public static void main(String[] args) {
		Weld weld = new Weld();
		WeldContainer container = weld.initialize();
		BookService bookService = container.instance().select(BookService.class).get();
		Book book = bookService.createBook("Sample 1", 5F, "sample book");
		System.out.println(book);
		weld.shutdown();
	}

}
