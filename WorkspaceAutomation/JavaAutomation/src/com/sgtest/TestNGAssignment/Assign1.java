package com.sgtest.TestNGAssignment;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assign1 {

	public static WebDriver oBrowser=null;
	public static Logger l = Logger.getLogger("Loop Output");
	@Test(priority = 1)
	public void launchBrowser()
	{
		try
		{
			
			System.setProperty("webdriver.chrome.driver", "E:\\Eclipse\\DemoAutomation\\WorkspaceAutomation\\JavaAutomation\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oBrowser.manage().window().maximize();
			l.info("The Browser Launched Successfully ----------------------");
			l.info("==================================================================");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Test(priority = 2)
	public void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:82/login.do");
			Thread.sleep(2000);
			l.info("The Navigation to ActiTime has Launched Successfully  ----------------------");
			l.info("==================================================================");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Test(priority = 6)
	public void closeApplication()
	{
		try
		{
			oBrowser.close();
			l.info("The Browser has Closed Successfully ----------------------");
			l.info("==================================================================");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Test(priority = 3)
	public void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
			l.info("The Logged to Application Successfully ----------------------");
			l.info("==================================================================");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 4)
	public void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
			l.info("The Minimizing The FlyOutWindow Minimized Successfully ----------------------");
			l.info("==================================================================");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 5)
	public void logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			l.info("The Logout to Application Successfully ----------------------");
			l.info("==================================================================");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
