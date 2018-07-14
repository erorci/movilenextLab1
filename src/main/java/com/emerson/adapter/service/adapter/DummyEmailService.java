package com.emerson.adapter.service.adapter;

import com.emerson.adapter.model.Employee;
import com.emerson.adapter.service.EmailService;

public class DummyEmailService implements EmailService {

	public void send(Employee employee) {
		System.out.println(employee.toString());

	}

}
