package com.sgtest.classprgms;
class AdditionofMatrix
{
	int[][] returnAdditonOfMatrix(int p[][], int r[][])
	{
		int c[][] = new int[3  ][3];
		for(int i=0; i<p.length; i++)
		{
			for(int j=0; j<p[i].length; j++)
			{
				c[i][j] = p[i][j] + r[i][j];
			}
		}
		return c;
	}
}
public class ReturnAddtion {
	public static void main(String[] args) {

		AdditionofMatrix oj = new AdditionofMatrix();
		int m[][] = {{1,2,3},{4,5,4}};
		int n[][] = {{3,2,4},{1,3,5}};

		int o[][] = oj.returnAdditonOfMatrix(m, n);
		for(int i=0; i<m.length; i++)
		{
			for(int j=0; j<m.length; j++)
			{
				System.out.print(o[i][j] + "  ");
			}
			System.out.println();
		}
	}
}
