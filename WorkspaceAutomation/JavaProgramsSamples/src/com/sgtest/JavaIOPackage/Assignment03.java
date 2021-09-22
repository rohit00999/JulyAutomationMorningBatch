package com.sgtest.JavaIOPackage;

import java.io.File;

public class Assignment03 {
	public static void main(String[] args) {
		createSubFolders();
	}
	static void createSubFolders() {
		for(int i=1;i<=20;i++) 
		{
			File f=new File("E:\\Inida\\A"+i);
			f.mkdirs();
		}
	}
}
