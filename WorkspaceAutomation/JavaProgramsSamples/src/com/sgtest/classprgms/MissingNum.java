package com.sgtest.classprgms;

import java.util.Arrays;

public class MissingNum {
	public static void main(String[] args) {

	      int arr[] = {0, 1, 3, 4, 5, 6};
	               Arrays.sort(arr);
	              int max=arr.length-1;
	              int index=0;
	              for(int i=0;i<max;i++)
		   {
		      if(i==arr[index])
		   {
		    index++;
		   }
		 else
		     {
		      System.out.println(i);
		     }
	           }
	       }		
	   }	  




