package com.sgtest.methodReturns;
class AdditionOfMatrices
{
	int [][] returnAddOfTwoMatrices(int a[][],int b[][])
	{
		int c[][]=new int[2][3];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		return c;
	}
}

public class AddOfTwoMatrices {
	public static void main(String[] args) {
		
		AdditionOfMatrices o=new AdditionOfMatrices();
		int x[][]= {{2,3,4},{5,2,1}};
		int y[][]= {{3,4,5},{4,7,4}};

		int z[][]=o.returnAddOfTwoMatrices(x,y);
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<=x.length;j++)
			{
				System.out.print(z[i][j] + "  ");
			}
			System.out.println();
		}
	}
}


