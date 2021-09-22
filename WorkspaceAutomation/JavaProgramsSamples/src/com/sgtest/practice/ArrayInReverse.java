package com.sgtest.practice;

public class ArrayInReverse {

	public static void main(String[] args) {
		// create the single dimension string array and read the element in reverse order..?
		
		String s1[] = {"koppal","bellary","hospet","bangalore"};
		
		for(int i=s1.length-1; i>=0; i--)
		{
			System.out.println(s1[i]);
		}
	}

}
