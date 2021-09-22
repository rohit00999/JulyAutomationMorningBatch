package com.sgtest.methodsprogramsassign;
class Addition
{
	void add(int q[][], int r[][])
	{
		for(int i=0; i<q.length; i++)
		{
			for(int j=0; j<q[i].length; j++)
			{
				System.out.print(q[i][j] + r[i][j] + "    ");
			}
			System.out.println();
			System.out.println();
		}
	}
}
public class AdditionOfTwoMatrix {
	public static void main(String[] args) {
		
		int w[][] = {{2,4,5},{30,25,15,}};
		int d[][] = {{2,5,1},{20,23,35}};
		
		Addition ai = new Addition();
		ai.add(w,d);
	}
}
