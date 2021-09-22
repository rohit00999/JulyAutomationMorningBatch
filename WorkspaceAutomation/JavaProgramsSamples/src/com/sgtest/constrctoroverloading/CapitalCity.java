package com.sgtest.constrctoroverloading;

class CapitalCity1
{
	CapitalCity1(String cname, short nooflang)
	{
		System.out.println("The capital city name is : " + cname);
		System.out.println("Total no of languages : " + nooflang);
	}
	CapitalCity1(int population)
	{
		System.out.println("The total no of population :  " + population);
	}
	CapitalCity1(String lang, double area)
	{
		System.out.println("The state capital language is : " + lang);
		System.out.println("Total area of Capital city is : " + area);
	}
	CapitalCity1(String cm)
	{
		System.out.println("The CM is : " + cm);
	}
}

public class CapitalCity {
	public static void main(String[] args) {

		CapitalCity1 cc1 = new CapitalCity1("Karnataka",(short) 1);
		CapitalCity1 cc2 = new CapitalCity1(1230000);
		CapitalCity1 cc3 = new CapitalCity1("Kannada", 304.43);
		CapitalCity1 cc4 = new CapitalCity1("XYZ");

	}

}
