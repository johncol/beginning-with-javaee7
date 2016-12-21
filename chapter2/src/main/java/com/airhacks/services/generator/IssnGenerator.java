package com.airhacks.services.generator;

import java.util.Random;
import java.util.logging.Logger;

import javax.inject.Inject;

import com.airhacks.annotations.qualifiers.EightDigits;

@EightDigits
public class IssnGenerator implements NumberGenerator {
	
	@Inject
	private Logger logger;

	@Override
	public String generate() {
		String isnn = "8-" + Math.abs(new Random().nextInt());
		logger.info("Generated number: " + isnn);
		return isnn;
	}

}
