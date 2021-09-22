package com.sgtest.PageObjectModelAssignment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q8 {

	public static WebDriver oBrowser=null;
	public static ActiTime opage1=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createCustomer();
		createProject();
		createTask();
		modifyTask();
		deletetask();
		deleteProject();
		deleteCustomer();
		logout();
		closeApplication();
	}

	public static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\Eclipse\\DemoAutomation\\WorkspaceAutomation\\JavaAutomation\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			opage1=new ActiTime(oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:82/login.do");
			oBrowser.manage().window().maximize();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void login()
	{
		try
		{
			opage1.getUserName().sendKeys("admin");
			opage1.getPassword().sendKeys("manager");
			opage1.getLogin().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void minimizeFlyOutWindow()
	{
		try
		{
			opage1.getFlyOutWindow().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void logout()
	{
		try
		{
			opage1.getLogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void closeApplication()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void createCustomer()
	{
		try
		{
			opage1.getTaskIcon().click();
			Thread.sleep(3000);
			opage1.getaddButtonfortask().click();;
			Thread.sleep(3000);
			opage1.getaddButtonforcust().click();
			Thread.sleep(3000);
			opage1.getcustName().sendKeys("customer01");
			Thread.sleep(3000);
			opage1.getsavecstm().click();
			Thread.sleep(3000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void deleteCustomer()
	{
		try
		{    
			opage1.getcustEdit().click();
			Thread.sleep(3000);
			opage1.getcustAction().click();
			Thread.sleep(3000);
			opage1.getcustDelete().click();
			Thread.sleep(3000);
			opage1.getconfirmDelete().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	public static void createProject()
	{
		try
		{
			opage1.getaddButtonfortask().click();
			Thread.sleep(3000);
			opage1.getprjtbtn().click();
			Thread.sleep(3000);
			opage1.EnterNameForProject().sendKeys("project12");
			Thread.sleep(3000);
			opage1.saveProject().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void deleteProject()
	{
		try
		{
			opage1.editProject().click();
			Thread.sleep(3000);
			opage1.actionProject().click();
			opage1.deleteProject().click();
			Thread.sleep(3000);
			opage1.confirmdeleteProject().click();
			Thread.sleep(3000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void  createTask()
	{
		try
		{
			opage1.getAddTask().click();
			Thread.sleep(3000);
			opage1.getnewTask().click();
			Thread.sleep(3000);
			opage1.getTN().sendKeys("task1");
			Thread.sleep(3000);
			opage1.getST().click();
			Thread.sleep(3000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void deletetask()
	{
		try
		{
			opage1.getclick().click();
			Thread.sleep(3000);
			opage1.getclickdelete().click();
			Thread.sleep(3000);
			opage1.getcnfrm().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void modifyTask()
	{
		try
		{
		opage1.getmoditask().click();
			Thread.sleep(3000);
			opage1.getTaskText().sendKeys("Rrrrrrccccccbbbb");
			Thread.sleep(3000);


		}catch(Exception e)
		{
			e.printStackTrace();

		}
	}
}






