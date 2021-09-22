package com.sgtest.classprgms;

public class StaticMembers_InTheSameClass {
	//Static members inside the same class doesnot requires object creation to access them in the main method
	
	static String name;
	static double salary;
	
	public static void displayName() {
		System.out.println("Name is Narendra Modi");
	}
	
	public static void displayCity() {
		System.out.println("City is RAICHUR");
	}
	
	public static void main(String[] args) {
		name = "Kalam";
		salary = 9999.50;
		System.out.println("Name: " + name +" & Salary : " + salary);
		
		displayName();
		displayCity();
	}
}
