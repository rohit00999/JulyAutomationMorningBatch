package com.sgtest.AbstractAssignment;
abstract class AA{
	AA(int a,int b)
	{
		System.out.println("addition of a and b: "+(a+b));
	}
	AA(String a)
	{
		System.out.println("city name:"+a);
	}
}
class BB extends AA{
	BB(int a,int b)
	{
		super(a,b);
	}
	BB(String a)
	{
		super(a);
	}
}
public class AbstractConstructorOverLoading {
	public static void main(String[] args) {
		BB b = new BB(10,10);
		BB b1 = new BB("Mysore");
	}
}
