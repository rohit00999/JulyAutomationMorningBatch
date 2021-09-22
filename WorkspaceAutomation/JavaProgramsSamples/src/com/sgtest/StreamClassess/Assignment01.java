package com.sgtest.StreamClassess;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Assignment01 {
	public static void main(String[] args) {
		
		// using byte string read content from one file and write content from another file;
				readAndWriteContent();

	}
	
	static void readAndWriteContent()
	{
		FileInputStream fin=null;
		FileOutputStream fout=null;
		try
		{
			fin= new FileInputStream("E:\\Java\\Test.txt");
			fout=new FileOutputStream ("E:\\Java\\Testnew.txt");
			int c;
			while((c=fin.read())!=-1)
			{
				fout.write(c);
				
			}
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(fin!=null)
				{
					fin.close();
					fout.close();
					
				}
			}catch (Exception e)
			{
				e.printStackTrace();
			}
		}

	}
}
