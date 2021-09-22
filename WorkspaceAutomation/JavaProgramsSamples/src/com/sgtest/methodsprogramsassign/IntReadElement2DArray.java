package com.sgtest.methodsprogramsassign;

class Integer
{
	void displayArray(int a[][])
	{
		for(int i=a.length-1; i>=0; i--)
		{
			for(int j=a[i].length-1; j>=0; j--)
			{
				System.out.print(a[i][j] + "  ");
			}
			System.out.println();
			System.out.println();			
		}
	}
}
public class IntReadElement2DArray {
	public static void main(String[] args) {
		
		int a[][] = {{11,22,33,44,55},{66,77,88,99,1010}};
		Integer in = new Integer();
		in.displayArray(a);

	}

}
