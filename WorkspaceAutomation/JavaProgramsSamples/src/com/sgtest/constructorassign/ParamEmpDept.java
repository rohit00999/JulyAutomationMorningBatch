package com.sgtest.constructorassign;

class Employee1
{
	int empid;
	String designation;
	String city;
	int salary;
	Employee1 (int id, String Desgn, String City, int sal)
	{
		empid = id;
		designation = Desgn;
		city = City;
		salary= sal;
		System.out.println("Empid : " + empid);
		System.out.println("Designation :  " + designation);
		System.out.println("City : "  + city);
		System.out.println("Salary : " + salary);
		System.out.println("************************************************");
	}
}

class Department1
{
	int deptno;
	String deptname;
	int noofemployeesindept;
	char gradeofdept;	
	Department1(int no, String name, int Employeeno, char Grade)
	{
		deptno=no;
		deptname = name;
		noofemployeesindept = Employeeno;
		gradeofdept = Grade;
		System.out.println(" Department Number :" + deptno);
		System.out.println(" Department Name : " + deptname);	
		System.out.println(" No of Employess in Department :" + noofemployeesindept);
		System.out.println(" Grade of Department : " + gradeofdept);    
	}
}

public class ParamEmpDept {
	public static void main(String args[])
	{
		Employee1 Ram = new Employee1(12, "Manager", "Bangalore",30000);
		//Employee1 Shyam = new Employee1(16, "Assistant", "Tumkur",15000);
		Department1 software = new Department1(5, "Testing", 48, 'B');
		//Department1 RealEstate  = new Department1(10, "Planning", 250, 'D');

	}
}
