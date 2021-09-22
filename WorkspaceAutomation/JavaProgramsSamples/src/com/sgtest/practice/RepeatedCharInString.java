package com.sgtest.practice;

public class RepeatedCharInString {
	public static void main(String[] args) {
		
		String a = "jhcbdfbsvyufbssus";
		char b = 's' ;
		int count=0;
		
		for(int i=0; i<a.length(); i++)
		{
			if(Character.valueOf(a.charAt(i)).equals(Character.valueOf(b)))
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
