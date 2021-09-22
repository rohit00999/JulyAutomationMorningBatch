package com.sgtest.oopsassign;

class SmartPhone
{
	String PhoneName;
	int Price;
	int Model;
	String OS;
}

class Desktop
{
	String DesktopName;
	String DesktopType;
	double price;
	String OS;
}

class Laptop
{
	String LaptopName;
	String LaptopGeneration;
	double Price;
	int model;
	String OS;
}

public class SmartPhoneDesktopLaptop {
	public static void main(String[] args) {
		
		SmartPhone sp = new SmartPhone();
		sp.PhoneName = "One plus 9pro";
		sp.Price = 40000;
		sp.Model = 2021;
		sp.OS = "Android Version";
		System.out.println("Phone Name is : " + sp.PhoneName);
		System.out.println("Phone Price is : " + sp.Price);
		System.out.println("Phone Model is : " + sp.Model);
		System.out.println("Phone OS Version is : " + sp.OS);
		
		System.out.println("**************************************************");
		
		Desktop dt = new Desktop();
		dt.DesktopName = "Sony";
		dt.DesktopType = "LED";
		dt.price = 43500.50;
		dt.OS = "WindowsOS";
		System.out.println("Desktop Name is : " + dt.DesktopName);
		System.out.println("Desktop Type is : " + dt.DesktopType);
		System.out.println("Desktop Price is : " + dt.price);
		System.out.println("Desktop OS Version is : " + dt.OS);
		
		System.out.println("**************************************************");
		
		Laptop lp = new Laptop();
		lp.LaptopName = "Dell";
		lp.LaptopGeneration = "i5 Generation";
		lp.Price = 55690.70;
		lp.model = 2018;
		lp.OS = "Windows 10";
		System.out.println("Laptop Name is :  " + lp.LaptopName);
		System.out.println("Laptop Generation is :  " + lp.LaptopGeneration);
		System.out.println("Laptop Price is :  " + lp.Price);
		System.out.println("Laptop Model is :  " + lp.model);
		System.out.println("Laptop Version is :  " + lp.OS);
			
	}

}
