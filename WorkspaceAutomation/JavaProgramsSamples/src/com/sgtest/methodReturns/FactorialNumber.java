package com.sgtest.methodReturns;
class Factorial
{
	int res = 1;
	int returnFactNum(int a)
	{
		for(int i=1; i<=a; i++)
		{
			res = res*i;
		}
		return res;
	}
}
public class FactorialNumber {
	public static void main(String[] args) {
		
		Factorial ff = new Factorial();
		System.out.println(ff.returnFactNum(3));	
	}
}
