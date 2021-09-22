package com.sgtest.inheritanceAssignment;
class AA
{
	void displayName(String fn)
	{
		System.out.println("This is AA Class: " + fn);
	}
}
class BB extends AA
{
	void displayName1(String fn)
	{
		System.out.println("This is BB Class : " + fn);
	}
}
class CC extends BB
{
	void displayName01(String fn)
	{
		System.out.println("This is CC Class : " + fn);
	}
}
class DD extends AA
{
	void displayName001(String fn)
	{
		System.out.println("This is DD class : "+ fn);
	}
}
public class HybridInheritance03 {
	public static void main(String[] args) {

		CC c = new CC();
		c.displayName("Abc");
		c.displayName1("WEB");
		c.displayName01("XYZ");
		
		DD d = new DD();
		d.displayName001("Sachin");
	}
}
