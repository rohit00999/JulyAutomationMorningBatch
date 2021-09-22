package com.sgtest.methodReturns;
class DivisibleBySix
{
	int count=0;
	int k=0;
	int [] returnDivBySix()
	{
		for(int j=1;j<=100;j++)
		{
			if(j%6==0)
			{
			count=count+1;
			}
		}	
		int b[] = new int[count];
		for(int i=1; i<=100; i++)
		{
			if(i%6== 0)
			{
				b[k] = i;
				k++;
			}
		}
		return b;
	}
}
public class DivBySix {
	public static void main(String[] args) {
		
		DivisibleBySix o=new DivisibleBySix();
		int x[] = o.returnDivBySix();
		for(int i=0; i<x.length; i++)
		{
			System.out.println(x[i]);
		}
	}
}
