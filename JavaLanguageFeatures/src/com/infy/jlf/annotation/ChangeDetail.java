package com.infy.jlf.annotation;

import java.lang.annotation.*;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ChangeDetail {
	String authorName();

	String methodName();
}
