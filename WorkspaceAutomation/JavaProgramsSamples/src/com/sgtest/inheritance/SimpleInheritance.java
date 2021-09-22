package com.sgtest.inheritance;
class BasicMaths1
{
	void addition(int x, int y)
	{
		System.out.println("Addition result is : " + (x+y));
	}
}
class BasicMaths2 extends BasicMaths1
{
	void substraction(int x,int y)
	{
		System.out.println("Substraction Result :"+(x-y));
	}
}

public class SimpleInheritance {
	public static void main(String[] args) {
		BasicMaths2 obj = new BasicMaths2();
		obj.addition(10, 10);
		obj.substraction(10, 5);


	}

}
