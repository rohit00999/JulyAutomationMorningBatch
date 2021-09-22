package com.sgtest.constructoroverchaining;

class Uni
{
	Uni(String uname, String city)
	{
		System.out.println("The University name is : " + uname);
		System.out.println("University is in : " + city);
	}
	Uni(int year, int noofemp)
	{
		this("Karnataka University","Dharwad");
		System.out.println("Found in the year : " + year);
		System.out.println("Total number of Employee : " + noofemp);
	}
	Uni(int typedeg, String deg)
	{
		this(1950, 500);
		System.out.println("Total number of degress in University : " + typedeg);
		System.out.println("Type of Degree : " + deg);
	}
}

public class University {
	public static void main(String[] args) {
		
		Uni un1 = new Uni(5, "Msc");

	}

}
