package com.sgtest.methodReturns;
class Fib{
	int [] returnFibNum(int a)
	{
		int a1[]=new int[a];
		int j=0;
		int b=1;
		int c=0;
		for(int i=0;i<10;i++)
		{
			c=j+b;
			a1[i]=c;
			j=b;
			b=c;  
		}
		return a1;
	}
}
public class FibonacciNum {
	public static void main(String[] args) {
		Fib fb=new Fib();
		int z[] = fb.returnFibNum(10);
		for(int i=0; i<z.length; i++)
		{
			System.out.println(z[i]);
		}	
	}
}
