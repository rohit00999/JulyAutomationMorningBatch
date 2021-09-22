package com.sgtest.AbstractAssignment;
abstract class Employee
{
	String EmpName;
	int Age;
	Employee(String name, int age)
	{
		EmpName = name;
		Age = age;
		System.out.println("Employee Name :  " + name);
		System.out.println("Employee Id is : " + age);
	}
}
class Manager extends Employee
{
	Manager(String name, int age)
	{
		super(name,age);
	}
}

public class AbstractParamConstructor {
	public static void main(String[] args) {
		Manager m = new Manager("ABCD",36);
	
	}

}
