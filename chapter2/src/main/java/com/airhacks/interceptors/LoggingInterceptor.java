package com.airhacks.interceptors;

import java.util.logging.Logger;

import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

import com.airhacks.annotations.bindings.Loggable;

@Interceptor
@Loggable
public class LoggingInterceptor {

	@Inject
	private Logger logger;

	@AroundInvoke
	public Object logMethod(InvocationContext ic) throws Exception {
		try {
			logger.entering(ic.getTarget().getClass().getName(), ic.getMethod().getName());
			return ic.proceed();
		} finally {
			logger.exiting(ic.getTarget().getClass().getName(), ic.getMethod().getName());
		}
	}

}
