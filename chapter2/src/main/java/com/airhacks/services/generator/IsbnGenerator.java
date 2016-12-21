package com.airhacks.services.generator;

import java.util.Random;
import java.util.logging.Logger;

import javax.inject.Inject;

import com.airhacks.annotations.qualifiers.ThirteenDigits;

@ThirteenDigits
public class IsbnGenerator implements NumberGenerator {
	
	@Inject
	private Logger logger;

	@Override
	public String generate() {
		String isbn = "13-84748" + Math.abs(new Random().nextInt());
		logger.info("Generated number: " + isbn);
		return isbn;
	}

}
