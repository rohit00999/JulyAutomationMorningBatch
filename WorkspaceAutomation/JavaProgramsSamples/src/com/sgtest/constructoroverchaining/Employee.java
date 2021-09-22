package com.sgtest.constructoroverchaining;

class Employee01
{
	Employee01(String empname)
	{
		System.out.println("The emplyoee name is : " + empname);
	}

	Employee01(int empid, int avgwork)
	{
		System.out.println("Employee id is : " + empid);
		System.out.println("Average working hours : " + avgwork);
	}
	Employee01(int sal)
	{
		this(1001, 8);
		System.out.println("Employee Salary is : " + sal);
	}
}

public class Employee {
	public static void main(String[] args) {

		Employee01 ee1 = new Employee01("ABCD");
		Employee01 ee2 = new Employee01(1200000);


	}

}
