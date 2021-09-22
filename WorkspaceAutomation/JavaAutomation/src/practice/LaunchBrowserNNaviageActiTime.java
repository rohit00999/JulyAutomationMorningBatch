package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowserNNaviageActiTime {
	public static WebDriver oBrowser = null;
	public static void main(String[] args) {
		LaunchBrowser();
		navigateBrowser();
		//loginApplicationAndVerifyLoginSuccessFull();
		//minimizeFlyOutWindow();
		//createUser();
		//deleteUser();
		//logoutApplication();
		//tearDown();
	}

	static void LaunchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\Eclipse\\DemoAutomation\\WorkspaceAutomation\\JavaAutomation\\Library\\Drivers\\chromedriver.exe");
			oBrowser = new ChromeDriver();
			oBrowser.manage().window().maximize();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void navigateBrowser()
	{
		try 
		{
			oBrowser.get("http://localhost:82/login.do");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void loginApplicationAndVerifyLoginSuccessFull()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
			
			if(oBrowser.findElement(By.xpath("//td[@class='pagetitle']")).getText().equalsIgnoreCase("Enter Time-Track"))
					{
				System.out.println("The login to ActiTime was successfull");
					}else
					{
						System.out.println("The login to ActiTime was not successfull");
						return;
					}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsMenuCloseId")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void createUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Demo");
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("User1");
			oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("Demo@gmail.com");
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("DemoUser1");
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("Welcome1");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("Welcome1");
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void deleteUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(500);
			Alert o = oBrowser.switchTo().alert();
			o.accept();
			Thread.sleep(1000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void logoutApplication()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void tearDown()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
