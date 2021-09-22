package com.sgtest.JavaIOPackage;

import java.io.File;

public class Assignment02 {

	public static void main(String[] args) {
		//createFolder();
		renameFolders();
	}

	static void createFolder() 
	{

		for(int i=1;i<=7;i++)
		{
			File f=new File("E:\\USA\\"+i);
			f.mkdirs();
		}
	}

	static void renameFolders()
	{
		String s[]= {"Sunday","Monday","Tuesday","Wednesday","Thrusday","Friday","Saturday"};
		for(int i=1;i<7;i++)
		{
			String path="E:\\USA\\";
			File f=new File(path+(i+1));
			File f1=new File(path+s[i]);
			f.renameTo(f1);

		}
	}
}
