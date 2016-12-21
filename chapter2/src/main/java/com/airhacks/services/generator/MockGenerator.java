package com.airhacks.services.generator;

import java.util.Random;
import java.util.logging.Logger;

import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import com.airhacks.annotations.qualifiers.ThirteenDigits;

@Alternative
@ThirteenDigits
public class MockGenerator implements NumberGenerator {
	
	@Inject
	private Logger logger;

	@Override
	public String generate() {
		String mock = "mock-" + Math.abs(new Random().nextInt());
		logger.info("Generated number: " + mock);
		return mock;
	}

}
