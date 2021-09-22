package com.sgtest.practice;

public class OneDArrayInReverse {

	public static void main(String[] args) {
		// 1-d Array in reverse order..??
		
		int a[] = {10,20,30,40};
		int b[] = {100,200,300,400};
		
		int c[] = new int [4];
		
		for(int i=0; i<a.length; i++)
		{
			c[i] = a[i] + b[i];
		}
		for(int j=c.length-1; j>=0; j--)
		{
			System.out.println(c[j]);
		}
	}

}
