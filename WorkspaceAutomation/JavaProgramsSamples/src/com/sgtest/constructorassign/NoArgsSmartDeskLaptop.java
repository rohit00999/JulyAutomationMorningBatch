package com.sgtest.constructorassign;

class SmartPhone
{
	String PhoneName;
	int Price;
	int Model;
	String OS;
	SmartPhone()
	{
		PhoneName = "One plus 9pro";
		Price = 40000;
		Model = 2021;
		OS = "Android Version";
		System.out.println("Phone Name is : " + PhoneName);
		System.out.println("Phone Price is : " + Price);
		System.out.println("Phone Model is : " + Model);
		System.out.println("Phone OS Version is : " + OS);
		System.out.println("**************************************************");
	}
}

class Desktop
{
	String DesktopName;
	String DesktopType;
	double price;
	String OS;
	Desktop()
	{
		DesktopName = "Sony";
		DesktopType = "LED";
		price = 43500.50;
		OS = "WindowsOS";
		System.out.println("Desktop Name is : " + DesktopName);
		System.out.println("Desktop Type is : " + DesktopType);
		System.out.println("Desktop Price is : " + price);
		System.out.println("Desktop OS Version is : " + OS);
		System.out.println("**************************************************");
	}
}

class Laptop
{
	String LaptopName;
	String LaptopGeneration;
	double Price;
	int model;
	String OS;
	Laptop()
	{
		LaptopName = "Dell";
		LaptopGeneration = "i5 Generation";
		Price = 55690.70;
		model = 2018;
		OS = "Windows 10";
		System.out.println("Laptop Name is :  " + LaptopName);
		System.out.println("Laptop Generation is :  " + LaptopGeneration);
		System.out.println("Laptop Price is :  " + Price);
		System.out.println("Laptop Model is :  " + model);
		System.out.println("Laptop Version is :  " + OS);
	}
}

public class NoArgsSmartDeskLaptop {
	public static void main(String[] args) {
		
		SmartPhone sp1 = new SmartPhone();
		Desktop dp1 = new Desktop();
		Laptop lp1 = new Laptop();
		
	}

}
