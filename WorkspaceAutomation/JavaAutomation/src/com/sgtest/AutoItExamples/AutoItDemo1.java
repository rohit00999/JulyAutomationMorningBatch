package com.sgtest.AutoItExamples;

public class AutoItDemo1 {

	public static void main(String[] args) {
		try
		{
			//Runtime.getRuntime().exec("E:\\SG Testing Notes\\AutoIt Scripts\\Demo1.exe");
			Runtime obj = Runtime.getRuntime();
			obj.exec("E:\\SG Testing Notes\\AutoIt Scripts\\Demo1.exe");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
