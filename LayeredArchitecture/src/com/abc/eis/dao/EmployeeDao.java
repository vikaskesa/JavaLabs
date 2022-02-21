package com.abc.eis.dao;

import java.util.List;

import com.abc.eis.bean.Employee;

public interface EmployeeDao{
	public String addEmployee(Employee e);
	public String insuranceScheme(double salary, String designation);
	public List<Employee> AllEmployee();

}
