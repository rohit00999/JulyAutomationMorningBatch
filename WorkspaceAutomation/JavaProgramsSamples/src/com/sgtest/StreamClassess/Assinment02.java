package com.sgtest.StreamClassess;

import java.io.FileReader;
import java.io.FileWriter;

public class Assinment02 {
	public static void main(String[] args) {
		//using Characteristic. read content from one file and write content from another file;
		readAndWriteChar();
	}
	static void readAndWriteChar()
	{
		FileReader fr=null;
		FileWriter fw=null;
		int n=0;
		try
		{
			fr= new FileReader("C:\\Java\\Test.txt");
			fw=new FileWriter ("C:\\Java\\Testnew1.txt");
			while(true)
			{
				n=fr.read();
				if(n==-1)break;
				char ch=(char)n;
				System.out.print(ch);
				fw.write(n);
			}
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fr.close();
				fw.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
