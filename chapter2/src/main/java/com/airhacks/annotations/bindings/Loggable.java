package com.airhacks.annotations.bindings;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.interceptor.InterceptorBinding;

@InterceptorBinding
@Target({ METHOD, TYPE })
@Retention(RUNTIME)
public @interface Loggable {
}
