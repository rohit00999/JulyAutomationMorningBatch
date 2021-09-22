package com.sgtest.practice;

public class TwoDArray {

	public static void main(String[] args) {
		// 2-d Array..
		
		int a[][]= {{11,21,31,41},{12,22,33,44}};
		
		for(int i=0; i<a.length; i++) 
		{
			for(int k=0; k<a[i].length; k++)
			{
				System.out.print(a[i][k] + "  ");
			}System.out.println();
		}

	}

}
