package com.luv2code.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.luv2code.springdemo.customvalid.CourseCode;

public class Customer {
	private String firstName;

	@NotNull(message = "required")
	@Size(min = 1, message = "is required")
	private String lastName;
	@NotNull(message = "is required")
	@Min(value = 0, message = "value must be equal or greater than zero")
	@Max(value = 10, message = "value must be equal or less than ten")
	private Integer coupons;
	@Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 chars/ digits")
	private String postalCode;
	@CourseCode(value="TVL", message="must be start with TVL")
	@NotNull
	
	private String courseCode;

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getCoupons() {
		return coupons;
	}

	public void setCoupons(Integer coupons) {
		this.coupons = coupons;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

}
