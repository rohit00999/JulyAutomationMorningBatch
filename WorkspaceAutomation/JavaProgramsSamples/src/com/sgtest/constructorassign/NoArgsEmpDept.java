package com.sgtest.constructorassign;

class Employee
{
	int empid;
	String designation;
	String city;
	int salary;
	Employee()
	{
		empid = 22;
		designation = "Manager";
		city = "bangalore";
		salary = 20000;
		System.out.println("Empid is : " + empid);
		System.out.println("Designation is :  " + designation);
		System.out.println("City is : "  + city);
		System.out.println("Salary is : " + salary);
		System.out.println("********************************************************");
	}
}

class Department
{
	int deptno;
	String deptname;
	int noofemployeesindept;
	char gradeofdept;	
	Department()
	{
		deptno= 51;
		deptname = "Testing"; 
		noofemployeesindept= 16;
		gradeofdept = 'A';
		System.out.println(" Department Number :" + deptno);
		System.out.println(" Department Name : " + deptname);
		System.out.println(" No of Employess in Department :" + noofemployeesindept);
		System.out.println(" Grade of Department : " + gradeofdept);    
	}
}

public class NoArgsEmpDept {
	public static void main(String args[])
	{
		Employee ee = new Employee();
		Department de = new Department();

	}
}
