package com.emerson.adapter.adapters;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.emerson.adapter.model.Employee;
import com.emerson.adapter.port.EmployeeRepository;

public class FileEmployeeRepository implements EmployeeRepository{
	
	private ArrayList<Employee> employees = new ArrayList<Employee>();

	public ArrayList<Employee> findEmployeesBornOn(int day, int month) {
		ArrayList<Employee> employeesBornOn = new ArrayList<Employee>();
		for (Employee employee: this.employees) {
			if (employee.bornOn(day, month))
				employeesBornOn.add(employee);
		}
		return employeesBornOn;
	}

	public void add(Employee employee) {		
	}
	
	public void loadFromFile(String fileLocation) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new FileReader(fileLocation));
		String line;
		while ((line = br.readLine()) != null) {
			String[] prop = line.split(",");
			String name = prop[0];
			String email = prop[1];
			int dayOfBirth = Integer.parseInt(prop[2].trim());
			int monthOfBirth = Integer.parseInt(prop[3].trim());
			employees.add(new Employee(name, email, dayOfBirth, monthOfBirth));
		}
		br.close();
	}
}
