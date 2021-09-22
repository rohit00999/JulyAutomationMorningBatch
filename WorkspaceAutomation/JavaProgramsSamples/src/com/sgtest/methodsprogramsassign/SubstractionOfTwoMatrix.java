package com.sgtest.methodsprogramsassign;

class Substraction
{
	void Sub(int y[][], int u[][])
	{
		for(int i=y.length-1; i>=0; i--)
		{
			for(int j=y[i].length-1; j>=0; j--)
			{
				System.out.print(y[i][j] - u[i][j] + "    ");
			}
			System.out.println();
			System.out.println();
		}
	}
}

public class SubstractionOfTwoMatrix {
	public static void main(String[] args) {
		
		int x[][] = {{100,200},{300,400}};
		int q[][] = {{10,20},{30,40}};
		
		Substraction stc = new Substraction();
		stc.Sub(x, q);

	}

}
