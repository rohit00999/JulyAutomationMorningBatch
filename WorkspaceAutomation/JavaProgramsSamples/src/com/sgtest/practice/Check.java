package com.sgtest.practice;

public class Check {
	public static void main(String args[])
	{
		String s1="suhas";
		String s2=s1.concat("123");
		String s3=s2;
		boolean res=Boolean.valueOf(s1=s3);
		boolean res2=Boolean.valueOf(s2=s3);
		System.out.println(res);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(res2);
		
	}
}
