package com.sgtest.iooperations;

import java.io.File;

class RecurssiveFolders
{
	static void findFolders(String path)
	{
		File f = new File(path);
		File f1[] = f.listFiles();
		for(File x:f1)
		{
			if(x.isDirectory())
			{
				findFolders(x.getAbsolutePath());
				System.out.println(x.getName());
			}
		}
	}
}
public class RecurrsionFolders {
	public static void main(String[] args) {
		
		RecurssiveFolders.findFolders("E:\\SG Testing Skype Notes");

	}

}
