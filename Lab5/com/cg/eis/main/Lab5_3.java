package com.cg.eis.main;
import com.cg.eis.exception.EmployeeException;
class Lab5_3{
	public static void main(String[] args){
		int salary=2000;
		try{
		if(salary<3000){
			System.out.println("Exception occured");
			throw new EmployeeException();
		}
		else{
			System.out.println(salary);
		}
		}

		catch(Exception e){
			System.out.println("enter the salary greater than 3000");
		}
	}
}