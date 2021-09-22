package com.sgtest.inheritanceAssignment;
class FF
{
	void displayCountryName(String name)
	{
		System.out.println("The FF country name is : " + name);
	}
}
class GG extends FF
{
	GG(String name)
	{
		super.displayCountryName(name);
	}
	void displayCountryName(String name)
	{
		System.out.println("The GG Country Name is : " + name);
	}
}
class HH extends GG
{
	HH(String ss)
	{
		super(ss);
		super.displayCountryName(ss);
	}
	void displayCountryName(String name)
	{
		System.out.println("The HH Country Name is : " + name);
	}
}
public class MultiLevelSameMethod {
	public static void main(String[] args) {
		
		HH h = new HH("CCCCCCC");
		h.displayCountryName("Russia");

	}
}
