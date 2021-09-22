package com.sgtest.methodReturns;

class Table
{
	int k = 0;
	int[] tenthTable(int a)
	{
		int b[] = new int[a];
		for(int i=1; i<=100; i++)
		{
			if(i%10 == 0)
			{
				b[k] = i;
				k++;
			}
		}
		return b;
	}
}
public class Return10thTable {
	public static void main(String[] args) {
		
		Table tb = new Table();
		int x[] = tb.tenthTable(10);
		for(int i=0; i<x.length; i++)
		{
			System.out.println(x[i]);
		}
	}
}
