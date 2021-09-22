package com.sgtest.AutoItExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadCvToNaukri {
	public static void main(String[] args) {
		ChromeDriver chrome = null;
		String exeFilePath = null;
		String browserName = null;
		String pageTitle = null;
		String filePath = null;
		try {
			System.setProperty("webdriver.chrome.driver", 
					"E:\\Eclipse\\DemoAutomation\\WorkspaceAutomation\\JavaAutomation\\Library\\Drivers\\chromedriver.exe");
			chrome = new ChromeDriver();
			chrome.manage().window().maximize();
			chrome.navigate().to("https://www.naukri.com/");
			Thread.sleep(2000);
			
			
			//Click on "upload CV" button
			chrome.findElement(By.xpath("//label[@id='wdgt-file-upload']")).click();
			Thread.sleep(4000);
			
			//Now we need to call the autoIT code to handle the upload file window components
			browserName = "Chrome";
			switch(browserName.toLowerCase()) {
				case "chrome":
					pageTitle = "Open";
					break;
				case "firefox":
					pageTitle = "File Upload";
					break;
				default:
					System.out.println("Invalid browser name");
			}
			
			exeFilePath = "E:\\SG Testing Skype Notes\\autoIT Programs\\UploadCV.exe";
			filePath = "E:\\SG Testing Skype Notes\\autoIT Programs\\UploadCv.docs";
			Runtime.getRuntime().exec(exeFilePath +" "+ pageTitle +" "+ filePath);
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			chrome = null;
			exeFilePath = null;
			browserName = null;
			pageTitle = null;
			filePath = null;
		}
	}
}
