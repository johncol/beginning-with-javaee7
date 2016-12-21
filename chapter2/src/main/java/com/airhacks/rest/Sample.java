package com.airhacks.rest;

import java.util.logging.Logger;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.airhacks.domain.Book;
import com.airhacks.services.BookService;

@Path("sample")
public class Sample {
	
	@Inject
	private BookService bookService;
	
	@Inject
	private Logger logger;
	
	@GET
	public Object get() {
		Book book = bookService.createBook("Enders Game", 76.4F, "It about the game of ender");
		logger.info("Generated book " + book);
		return "cool!";
	}

}
