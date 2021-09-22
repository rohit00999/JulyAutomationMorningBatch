package com.sgtest.constructoroverchaining;

class GovtOff
{
	GovtOff(String gname)
	{
		System.out.println("The name of govt dept : " + gname);
	}
	GovtOff(String city, int noofemp)
	{
		this("IncomeTax");
		System.out.println("The office is in : " + city);
		System.out.println("Total number of Employees : " + noofemp);
	}
	GovtOff(int sal)
	{
		System.out.println("The salary of Employee is : " + sal);
	}
}

public class GovernmentOffice {
	public static void main(String[] args) {
		
		GovtOff go1 = new GovtOff("Bangalore", 25);
		GovtOff go2 = new GovtOff(56000);

	}

}
