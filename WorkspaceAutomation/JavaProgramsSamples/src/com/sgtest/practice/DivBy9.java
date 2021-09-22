package com.sgtest.practice;

public class DivBy9 {
	  public static void main(String args[])
	    {
		 int num = Integer.parseInt(args[0]);
	     if(num%9==0)
	      {
	        System.out.println("the given number is divisible by 9");
	      }
	      else
	      { 
	        System.out.println("the given number is not divisible by 9");
	      }
	    }	
	   
}
