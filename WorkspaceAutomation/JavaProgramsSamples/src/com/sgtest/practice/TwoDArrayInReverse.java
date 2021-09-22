package com.sgtest.practice;

public class TwoDArrayInReverse {

	public static void main(String[] args) {
		// array has some elements and print it in reverse order..?

		int a[][] = {{101,201,301,401},{11,21,31,41}};

		for(int i=0; i<a.length; i++)
		{
			for(int j=a[i].length-1; j>=0; j--)
			{
				System.out.print(a[i][j]+ "  ");
			}
			System.out.println();
		}
	}

}
