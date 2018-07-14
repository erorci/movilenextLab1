package com.emerson.adapter.port;

import java.util.ArrayList;

import com.emerson.adapter.model.Employee;

public interface EmployeeRepository {

	ArrayList<Employee> findEmployeesBornOn(int day, int month);
	void add(Employee employee);
}
