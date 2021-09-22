package com.sgtest.constructorassign;

class SmartPhone1
{
	String PhoneName;
	int Price;
	int Model;
	String OS;
	SmartPhone1(String phonename, int price, int model, String os)
	{
		PhoneName = phonename;
		Price = price;
		Model = model;
		OS = os;
		System.out.println("Phone Name is : " + PhoneName);
		System.out.println("Phone Price is : " + Price);
		System.out.println("Phone Model is : " + Model);
		System.out.println("Phone OS Version is : " + OS);
		System.out.println("**************************************************");
	}
}

class Desktop1
{
	String DesktopName;
	String DesktopType;
	double price;
	String OS;
	Desktop1(String desktopname, String type, double price, String os)
	{
		DesktopName = desktopname;
		DesktopType = type;
		price = price;
		OS = os;
		System.out.println("Desktop Name is : " + DesktopName);
		System.out.println("Desktop Type is : " + DesktopType);
		System.out.println("Desktop Price is : " + price);
		System.out.println("Desktop OS Version is : " + OS);
		System.out.println("**************************************************");
	}
}

class Laptop1
{
	String LaptopName;
	String LaptopGeneration;
	double Price;
	int model;
	String OS;
	Laptop1(String lapname, String lapgen, double price, int model, String os)
	{
		LaptopName = lapname;
		LaptopGeneration = lapgen;
		Price = price;
		model = model;
		OS = os;
		System.out.println("Laptop Name is :  " + LaptopName);
		System.out.println("Laptop Generation is :  " + LaptopGeneration);
		System.out.println("Laptop Price is :  " + Price);
		System.out.println("Laptop Model is :  " + model);
		System.out.println("Laptop Version is :  " + OS);
	}
}

public class ParamSmartDeskLaptop {
	public static void main(String[] args) {
		
		SmartPhone1 sp1 = new SmartPhone1("One Plus", 20000, 2019, "Android-Version");
		Desktop1 dt1 = new Desktop1("Sony","LED", 30000,"Windows OS");
		Laptop1 lp1 = new Laptop1("Dell", "i5 Generation", 55600.70, 2019, "Windows OS");
	}

}
