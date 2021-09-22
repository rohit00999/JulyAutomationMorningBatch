package com.sgtest.methodReturns;
class SquareOfFirstTenNums{
	int [] returnSquareOfNums()
	{
		
		int a[]=new int[10];
		int k=0;
		for(int i=1;i<=10;i++)
		{
			 a[k]=i*i;
			 k++;
		}
		return a;
	}
}
public class MethodSquareOfFirstTenNums {
	public static void main(String[] args) {

		SquareOfFirstTenNums o=new SquareOfFirstTenNums();
		int b[]=o.returnSquareOfNums();
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}		
	}
}
