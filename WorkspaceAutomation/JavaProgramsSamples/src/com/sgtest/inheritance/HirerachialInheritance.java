package com.sgtest.inheritance;
class BasicMaths001
{
	void addition(int x,int y)
	{
		System.out.println("Addition Result :"+(x+y));
	}
}

class BasicMaths002 extends BasicMaths001
{
	void substraction(int x,int y)
	{
		System.out.println("Substraction Result :"+(x-y));
	}
}
class BasicMaths003 extends BasicMaths001
{
	void multiplication(int x,int y)
	{
		System.out.println("Multiplication Result :"+(x*y));
	}
}

public class HirerachialInheritance {
	public static void main(String[] args) {
		BasicMaths003 obj2 = new BasicMaths003();
		obj2.addition(10, 10);
		obj2.multiplication(3, 4);
		
		BasicMaths002 ob = new BasicMaths002();
		ob.addition(2,4);
		ob.substraction(10, 5);
		

	}

}
