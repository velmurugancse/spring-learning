package com.luv2code.springdemo.customvalid;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {
	private String coursePrefix;
	@Override
	public void initialize(CourseCode coursecode) {
		coursePrefix = coursecode.value();
		System.out.println(coursePrefix);
	}

	@Override
	public boolean isValid(String code, ConstraintValidatorContext cvc) {
		boolean result;
		if(code!=null) {
			System.out.println(code);
		result= code.startsWith(coursePrefix);
		}
		else {
			result = true;
		}
		return result;
	}

}
