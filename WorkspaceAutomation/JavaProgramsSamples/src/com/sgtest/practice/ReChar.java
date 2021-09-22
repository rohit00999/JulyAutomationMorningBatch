package com.sgtest.practice;

import java.util.HashSet;

public class ReChar {

	public static void main(String[] args) {
		String s1="suhas";
		char []s=s1.toCharArray();
		int count=0;
		int len1=s1.length();
		int len2=s.length;
		System.out.println(len1);
		System.out.println(len2);
		//for(int i=0;i<=s.length-1;i++)
			for(int i=s.length-1;i>0;i--)
		{
			char ch=s1.charAt(i);
			if(ch==s[i])
			{
				count++;
			}
			
		}
		if(count>0)
		{
			System.out.println("Repeated: " + count);
		}
		else
		{
			System.out.println("Not Repeated");
		}		
	}
}
