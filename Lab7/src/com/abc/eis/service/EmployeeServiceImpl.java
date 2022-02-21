package com.abc.eis.service;

import java.util.List;

import com.abc.eis.bean.Employee;
import com.abc.eis.dao.EmployeeDao;
import com.abc.eis.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {
	EmployeeDao dao=new EmployeeDaoImpl();
	 @Override
	public String addEmployee(Employee e) {
		if(e.getId().length()==0 || e.getName().length()==0 || e.getSalary()<=0) {
		   return "Enter Valid Data";
		}else {
			return dao.addEmployee(e);	
		}
	}
	 @Override
	public String insuranceScheme(double salary,String designation) {
		if(salary<=0 || designation.length()==0) {
			return "Enter Valid Data";
		}
		else {
			return dao.insuranceScheme(salary,designation);
		}
	}
	 @Override
	public List<Employee> AllEmployee() {
		return dao.AllEmployee();
	}
}
