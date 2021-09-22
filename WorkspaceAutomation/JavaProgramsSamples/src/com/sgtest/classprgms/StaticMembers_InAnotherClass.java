package com.sgtest.classprgms;

class Sample1
{
	static String name;
	static double salary;
	
	public static void displayName() {
		System.out.println("Name is Narendra Modi");
	}
	
	public static void displayCity() {
		System.out.println("City is RAICHUR");
	}
}


public class StaticMembers_InAnotherClass {
	public static void main(String[] args) {
		Sample1.name = "Modi";
		Sample1.salary = 9999.50;
		System.out.println("Name:"+Sample1.name + " & Salary: "+Sample1.salary);
		
		Sample1.displayName();
		
		Sample1.displayCity();
	}
}
