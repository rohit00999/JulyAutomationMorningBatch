package com.sgtest.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment06 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		LaunchBrowser();
		navigate();
		Login();
		minimize();
		creatcustomer();
		//createproj();
		modifyproj();

	}
	
	static void LaunchBrowser()
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
			oBrowser.get("http://localhost:82/login.do");
			oBrowser.manage().window().maximize();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void Login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void minimize()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'gettingStartedShortcutsPanelId\']/div[1]")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void creatcustomer()
	{
		try

		{
			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div/div[1]")).click();
			//oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")).click();
			//Thread.sleep(2000);
			//oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			//Thread.sleep(4000);
			//oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("Oracle");
			//oBrowser.findElement(By.id("customerLightBox_descriptionField")).sendKeys("IT  company");
			//oBrowser.findElement(By.xpath("//*[@id=\'customerLightBox_commitBtn\']/div/span")).click();
			//Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createproj()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")).click();
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys("xyz");
		//	oBrowser.findElement(By.id("ext-gen23")).click();
			//oBrowser.findElement(By.id("ext-gen112")).click();
			oBrowser.findElement(By.name("projectDescriptionField")).sendKeys("AB");
			oBrowser.findElement(By.xpath("//*[@id=\'projectPopup_commitBtn\']/div/span")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modifyproj()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[2]/div/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[2]/div/div[2]/input")).sendKeys(" AZ");
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}


}
