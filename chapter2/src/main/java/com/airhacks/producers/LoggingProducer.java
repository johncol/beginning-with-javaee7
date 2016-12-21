package com.airhacks.producers;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

public class LoggingProducer {
	
	@Produces
	public Logger logger(InjectionPoint injection) {
		String className = injection.getMember().getDeclaringClass().getName();
		Logger logger = Logger.getLogger(className);
		logger.setLevel(Level.FINER);
		return logger;
	}

}
