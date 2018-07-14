package com.emerson.adapter.model;

public class Employee {

	private String name;
	private String email;
	private int dayOfBirth;
	private int monthOfBirth;

	public Employee(String name, String email, int dayOfBirth, int monthOfBirth) {
		this.name = name;
		this.email = email;
		this.dayOfBirth = dayOfBirth;
		this.monthOfBirth = monthOfBirth;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getDayOfBirth() {
		return dayOfBirth;
	}

	public void setDayOfBirth(int dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
	}

	public int getMonthOfBirth() {
		return monthOfBirth;
	}

	public void setMonthOfBirth(int monthOfBirth) {
		this.monthOfBirth = monthOfBirth;
	}

	public boolean bornOn(int day, int month) {
		return dayOfBirth == day && monthOfBirth == month;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", email=" + email + ", dayOfBirth=" + dayOfBirth + ", monthOfBirth="
				+ monthOfBirth + "]";
	}

}
