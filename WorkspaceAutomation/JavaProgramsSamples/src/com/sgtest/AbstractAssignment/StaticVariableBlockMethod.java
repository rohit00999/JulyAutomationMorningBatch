package com.sgtest.AbstractAssignment;
abstract class Sports
{
	static String type;
	static int b;
	static
	{
		type="Cricket";
		play();
	}
	static void play()
	{
		System.out.println("Type of Sports Name : "+ type);		
	}
}
public class StaticVariableBlockMethod {
	public static void main(String[] args) {
		Sports.b = 12;
		System.out.println(Sports.b);
	}

}
