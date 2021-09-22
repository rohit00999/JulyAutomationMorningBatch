package com.sgtest.methodsprogramsassign;
class Char
{
	void displayCharArray(char b[][])
	{
		for(int i=b.length-1; i>=0; i--)
		{
			for(int j=b[i].length-1; j>=0; j--)
			{
				System.out.print(b[i][j] + "    ");
			}
			System.out.println();
			System.out.println();
		}
	}
}
public class CharReadElement2DArray {
	public static void main(String[] args) {

		char z[][] = {{'a','b','c','d','e'},{'q','w','e','r','t'}};
		Char cr = new Char();
		cr.displayCharArray(z);
	}
}
