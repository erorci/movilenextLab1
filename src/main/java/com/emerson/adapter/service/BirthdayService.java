package com.emerson.adapter.service;

import java.util.ArrayList;

import com.emerson.adapter.model.Employee;
import com.emerson.adapter.port.EmployeeRepository;

public class BirthdayService {
	
	private EmailService emailService;
	
	private EmployeeRepository employeeRepository;
	
	public BirthdayService(EmployeeRepository employeeRepository, EmailService emailService) {
		this.employeeRepository = employeeRepository;
		this.emailService = emailService;
	}
	
	public void sendGreetingsToEmployeeBornOn(int day, int month) {
		ArrayList<Employee> employees = employeeRepository.findEmployeesBornOn(day, month);
		for(Employee employee: employees) 
			emailService.send(employee);
	}

}
