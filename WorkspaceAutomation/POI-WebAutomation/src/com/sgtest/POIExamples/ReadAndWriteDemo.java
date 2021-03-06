package com.sgtest.POIExamples;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAndWriteDemo {
	public static void main(String[] args) {
		readWriteContent();

	}
	
	static void readWriteContent()
	{
		FileInputStream fin=null;
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh1=null;
		Sheet sh3=null;
		Row rowsh1=null;
		Row rowsh3=null;
		Cell cellsh1=null;
		Cell cellsh3=null;
		try
		{
			fin=new FileInputStream("E:\\SG Testing Notes\\Poi Excel File\\Test.xlsx");
			wb=new XSSFWorkbook(fin);
			sh1=wb.getSheet("Sheet1");
					
			sh3=wb.getSheet("Sheet3");
			if(sh3==null)
			{
				sh3=wb.createSheet("Sheet3");
			}
			int rc=sh1.getPhysicalNumberOfRows();
			for(int r=0;r<rc;r++)
			{
				rowsh1=sh1.getRow(r);
				rowsh3=sh3.getRow(r);
				if(rowsh3==null)
				{
					rowsh3=sh3.createRow(r);
				}
				int cc=rowsh1.getPhysicalNumberOfCells();
				for(int c=0;c<cc;c++)
				{
					cellsh1=rowsh1.getCell(c);
					cellsh3=rowsh3.getCell(c);
					if(cellsh3==null)
					{
						cellsh3=rowsh3.createCell(c);
					}
					String data=cellsh1.getStringCellValue();
					cellsh3.setCellValue(data);
				}
			}
			fout=new FileOutputStream("E:\\SG Testing Notes\\Poi Excel File\\Test.xlsx");
			wb.write(fout);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fin.close();
				fout.close();
				wb.close();
				wb=null;
				sh1=null;
				sh3=null;
				rowsh1=null;
				rowsh3=null;
				cellsh1=null;
				cellsh3=null;
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
