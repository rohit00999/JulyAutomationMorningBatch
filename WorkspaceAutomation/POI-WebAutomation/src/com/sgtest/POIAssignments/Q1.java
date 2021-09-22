package com.sgtest.POIAssignments;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Q1 {

public static void main(String[] args) {
		
		FileOutputStream fos = null;
		Workbook wb=null;
		Sheet sh=null;
		Row row = null;
		Cell cell = null;
				
		try {
			wb = new XSSFWorkbook();
			sh=wb.createSheet("FruitNames");
			for(int i=0;i<20;i++)
			{
				row=sh.createRow(i);
				cell=row.createCell(0);
				cell.setCellValue("Fruit"+i);
				
			}
			
			fos=new FileOutputStream("E:\\JavaAutomation\\Q1.xlsx");
			wb.write(fos);
			System.out.println("File written successfully");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			
		}
		try {
			fos.close();
			wb.close();
			wb=null;
			sh=null;
			row=null;
			cell=null;
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
