package com.sgtest.StreamClassess;

import java.io.File;
import java.io.FileReader;
import java.io.LineNumberReader;

public class Assignment03 {
	public static void main(String[] args) {

		// There is text file it has n no.of lines of content Find the no. of lines in a file;
		nooflines();
	}
	static void nooflines()
	{
		File obj=new File("C:\\Java\\Test2.txt");
		if(obj.exists())
		{
			try
			{
				FileReader fr =new FileReader(obj);
				LineNumberReader lr=new LineNumberReader(fr);
				int x=0;
				try
				{
					while(lr.readLine()!=null)
					{
						x++;
					}
					System.out.println("Total no.of lines:"+x);

				}catch (Exception e)
				{
					e.printStackTrace();

				}


			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
