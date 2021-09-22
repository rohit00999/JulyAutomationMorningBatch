package com.sgtest.inheritance;
class BasicMaths0001
{
	void addition(int x,int y)
	{
		System.out.println("Addition Result :"+(x+y));
	}
}

class BasicMaths0002 extends BasicMaths0001
{
	void substraction(int x,int y)
	{
		System.out.println("Substraction Result :"+(x-y));
	}
}
class BasicMaths0003 extends BasicMaths0001
{
	
	void multiplication(int x,int y)
	{
		System.out.println("Multiplication Result :"+(x*y));
	}
}

class BasicMaths0004 extends BasicMaths0003
{
	void division(int x,int y)
	{
		System.out.println("Division Result :"+(x/y));
	}
}

public class HybridInheritance {
	public static void main(String[] args) {
		BasicMaths0004 o = new BasicMaths0004();
		o.addition(10, 20);
		o.multiplication(2, 6);
		o.division(4, 2);
		
		BasicMaths0002 oo = new BasicMaths0002();
		oo.addition(10,30);
		oo.substraction(20, 10);


	}

}
