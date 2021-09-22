package com.sgtest.FramesDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrameDemo {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		identifyElements();
	}
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\Eclipse\\DemoAutomation\\WorkspaceAutomation\\JavaAutomation\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void navigate()
	{
		try
		{
			oBrowser.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
			oBrowser.manage().window().maximize();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void identifyElements()
	{
		try
		{
			oBrowser.switchTo().frame("packageListFrame");
			oBrowser.findElement(By.xpath("/html/body/main/ul/li[1]/a")).click();
			Thread.sleep(2000);
			oBrowser.switchTo().defaultContent();
			Thread.sleep(2000);
			oBrowser.switchTo().frame("packageFrame");
			oBrowser.findElement(By.xpath("/html/body/main/div/section[1]/ul/li[14]/a/span")).click();
			Thread.sleep(2000);
			oBrowser.switchTo().defaultContent();
			Thread.sleep(2000);
			oBrowser.switchTo().frame(2);
			String c = oBrowser.findElement(By.xpath("/html/body/main/div[2]/div[1]/ul/li/dl[2]")).getText();
			System.out.println(c);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
