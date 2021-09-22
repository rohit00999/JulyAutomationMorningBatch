package com.sgtest.AutoItExamples;

public class AutoItDemo2 {
	public static void main(String[] args) {
		
		try
		{
			Runtime.getRuntime().exec("E:\\SG Testing Notes\\AutoIt Scripts\\Demo2.exe");
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
