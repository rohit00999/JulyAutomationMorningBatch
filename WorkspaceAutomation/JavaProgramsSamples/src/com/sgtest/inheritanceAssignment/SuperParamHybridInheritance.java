package com.sgtest.inheritanceAssignment;
class RR 
{
	RR(String fn)
	{
		System.out.println("The RR Name is : " + fn);
	}
}
class TT extends RR 
{
	TT(String fn)
	{
		super(fn);
		System.out.println("The TT Name is : " + fn);
	}
}
class YY extends TT
{
	YY(String fn)
	{
		super(fn);
		System.out.println("The YY Name is : " + fn);
	}
}
class UU extends RR
{
	UU(String fn)
	{
		super(fn);
		System.out.println("The UU Name is : " + fn);
	}
}
public class SuperParamHybridInheritance {
	public static void main(String[] args) {
		
		YY y = new YY("Laxman");
		UU u = new UU("Rahane");
	}

}
