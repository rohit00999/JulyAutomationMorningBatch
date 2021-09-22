package com.sgtest.inheritanceAssignment;
class ZZ
{
	void displaySportName(String name)
	{
		System.out.println("The ZZ SportName is : " + name);
	}
}
class XX extends ZZ
{
	XX(String n)
	{
		super.displaySportName(n);
	}
	void displaySportName(String name)
	{
		System.out.println("The XX SportName is : " + name);
	}
}
class VV extends ZZ
{
	VV(String ddd)
	{
		super.displaySportName(ddd);
	}
	void displaySportName(String name)
	{
		System.out.println("The VV SportName is : " + name);
	}
}
public class HirerachicalInheritanceSameMethod {
	public static void main(String[] args) {
		
		XX x = new XX("Cricket");
		x.displaySportName("BasketBall");
		
		VV v =  new VV("Hockey");
		v.displaySportName("rugby");
	}
}
