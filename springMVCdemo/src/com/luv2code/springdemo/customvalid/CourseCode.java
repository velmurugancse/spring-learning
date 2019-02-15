package com.luv2code.springdemo.customvalid;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
//default value
	public String value() default "SOM";
	//default error message
	public String message() default "must start with SOM";
	//for group
	public Class<?>[] groups() default{};
	//for payload
	public Class<? extends Payload>[] payload() default{};
}
