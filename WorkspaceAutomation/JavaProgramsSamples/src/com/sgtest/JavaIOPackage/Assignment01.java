package com.sgtest.JavaIOPackage;

import java.io.File;

public class Assignment01 {
	public static void main(String[] args) {
		createFile();
		//fileCollection();
		//deleteDocx();
		//renameXlsx();
	}	
	static void createFile()
	{
		try 
		{
			for(char i=1;i<=3;i++)
			{
				File f=new File("E:\\Russia\\"+i+".txt1");
				f.createNewFile();
				f=new File("E:\\Russia\\"+i+".xlsx1");
				f.createNewFile();
				f=new File("E:\\Russia\\"+i+".docx1");
				f.createNewFile();
				f=new File("E:\\Russia\\"+i+".doc1");
				f.createNewFile();
			}	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void fileCollection()
	{
		int count=0;
		File f=new File("E:\\Russia");
		File f1[]=f.listFiles();
		for(File kk:f1)
		{
			System.out.println(kk);
			count++;
		}
		System.out.println(count);
	}

	static void deleteDocx()
	{
		String path="E:\\Russia";
		String path1="";
		File f=new File(path);
		File f1[]=f.listFiles();

		for(int i=0;i<f1.length;i++) {
			if(f1[i].getName().endsWith(".docx")) {
				path1=f1[i].getName();
				System.out.println(path+"\\"+path1);
				File f2=new File(path+"\\"+path1);
				f2.delete();
			}
		}
	}

	static void renameXlsx()
	{
		String path="E:\\Russia";
		String path1="";
		File f=new File(path);
		File f1[]=f.listFiles();
		char k=87;
		for(int i=0;i<f1.length;i++) {
			if(f1[i].getName().endsWith(".xlsx")) {
				path1=f1[i].getName();
				System.out.println(path+"\\"+k+".xlsx");

				File f2=new File(path+"\\"+path1);
				File f3=new File(path+"\\"+k+".xlsx");
				k++;
				f2.renameTo(f3);

			}
		}
	}
}




