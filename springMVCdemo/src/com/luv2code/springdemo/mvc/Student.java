package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
	private String firstname;
	private String lastname;
	private String country;
//	private LinkedHashMap<String, String> countryOptions;
	private String favoritelanguage;
	private LinkedHashMap<String, String> langOptions;
	private String[] operatingSystem;

	public Student() {
		/*
		 * countryOptions = new LinkedHashMap<String, String>();
		 * countryOptions.put("IND", "india"); countryOptions.put("CHN", "china");
		 * countryOptions.put("SPN", "spain"); countryOptions.put("GER", "germany");
		 */
		langOptions = new LinkedHashMap();
		langOptions.put("Java", "java");
		langOptions.put("PHP", "php");
		langOptions.put("C#", "csharp");
		langOptions.put("Selenium", "selenium");
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFavoritelanguage() {
		return favoritelanguage;
	}

	public void setFavoritelanguage(String favoritelanguage) {
		this.favoritelanguage = favoritelanguage;
	}

	public LinkedHashMap<String, String> getLangOptions() {
		return langOptions;
	}

	public void setLangOptions(LinkedHashMap<String, String> langOptions) {
		this.langOptions = langOptions;
	}

	public String[] getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String[] operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	/*
	 * public LinkedHashMap<String, String> getCountryOptions() { return
	 * countryOptions; }
	 */
}
