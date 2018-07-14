package com.emerson.adapter.port;

import com.emerson.adapter.model.Employee;

public interface EmailPort {
	void send(Employee employee);
}
