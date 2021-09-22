package com.sgtest.oopsassign;

class Employee
{
	String Firstname;
	int age;
	int ID;
	String City;
}

class Department
{
	String DeptName;
	int DeptId;
	String City;
}

public class EmpAndDept {

	public static void main(String[] args) {
		
		Employee ee = new Employee();
		ee.Firstname = "ABCD";
		ee.age = 45;
		ee.ID = 1001;
		ee.City = "Mysore";
		System.out.println("FirstName is : " + ee.Firstname);
		System.out.println("Employee age is : " + ee.age);
		System.out.println("Employee ID is : " + ee.ID);
		System.out.println("CityName is : " + ee.City);
		
		System.out.println("************************************************");
		
		Department dd = new Department();
		dd.DeptName = "XYZ";
		dd.DeptId = 1002;
		dd.City = "Bangalore";
		System.out.println("DeptName is : " + dd.DeptName);
		System.out.println("DeptId is : " + dd.DeptId);
		System.out.println("CityName is : " + dd.City);
		
	}

}
