package com.sgtest.methodsprogramsassign;

class Sports
{
	void displayArray(String s[][])
	{
		for(int i=0; i<s.length; i++)
		{
			for(int j=0; j<s[i].length; j++)
			{
				System.out.print(s[i][j] + "  ");
			}
			System.out.println();
			System.out.println();
			
		}
	}
}


public class ReadStringElement2DArray {
	public static void main(String[] args) {
		
		String s[][] = {{"Cricket","VolleyBall","BasketBall"},{"Rugby","Hockey","FootBall"}};
		Sports so = new Sports();
		so.displayArray(s);

	}

}
