package com.sgtest.inheritance;
class BasicMaths01
{
	void addition(int x,int y)
	{
		System.out.println("Addition Result :"+(x+y));
	}
}

class BasicMaths02 extends BasicMaths01
{
	void substraction(int x,int y)
	{
		System.out.println("Substraction Result :"+(x-y));
	}
}
class BasicMaths03 extends BasicMaths02
{
	void multiplication(int x,int y)
	{
		System.out.println("Multiplication Result :"+(x*y));
	}
}

public class MultilevelInheritance {
	public static void main(String[] args) {
		BasicMaths03 obj1 = new BasicMaths03();
		obj1.addition(10,10);
		obj1.substraction(20,10);
		obj1.multiplication(5,5);

	}

}
