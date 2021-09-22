package com.sgtest.JavaIOPackage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Assignment04 {
	public static void main(String[] args) {
		createNestDict2();
	}
	static void createNestDict2()
	{
		File f=new File("E:\\mainfolder\\ss1\\ss2\\ss3\\ss4");
		Path p=f.toPath();
		if(!Files.exists(p))
		{
			try {
				Files.createDirectories(p);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
