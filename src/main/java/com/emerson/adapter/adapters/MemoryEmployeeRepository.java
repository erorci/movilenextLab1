package com.emerson.adapter.adapters;

import java.util.ArrayList;

import com.emerson.adapter.model.Employee;
import com.emerson.adapter.port.EmployeeRepository;

public class MemoryEmployeeRepository implements EmployeeRepository {

	private ArrayList<Employee> employees = new ArrayList<Employee>();

	public ArrayList<Employee> findEmployeesBornOn(int day, int month) {
		ArrayList<Employee> employeeBornOn = new ArrayList<Employee>();
		for(Employee employee: this.employees) {
			if (employee.bornOn(day, month))
				employeeBornOn.add(employee);
		}
		return employeeBornOn;
	}

	public void add(Employee employee) {
		this.employees.add(employee);
		
	}

}
