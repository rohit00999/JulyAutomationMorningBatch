package com.sgtest.constrctoroverloading;

class SmartPhone
{
	SmartPhone(String bname, String type)
	{
		System.out.println("Brand name is : " + bname);
		System.out.println("Type of Mobile : " + type);
	}
	SmartPhone(int price)
	{
		System.out.println("Cost of Smartphone : " + price);
	}
	SmartPhone(int rom, int model)
	{
		System.out.println("Smartphone inbuilt Memory : " + rom);
		System.out.println("Smartphone model is : " + model);
	}
	SmartPhone(String version)
	{
		System.out.println("Smartphone version is : " + version);
	}
}

public class SmartPhones {

	public static void main(String[] args) {
		
		SmartPhone sh1 = new SmartPhone("OnePlus","TouchType");
		SmartPhone sh2 = new SmartPhone(45000);
		SmartPhone sh3 = new SmartPhone(128, 2018);
		SmartPhone sh4 = new SmartPhone("Andriod Version");
 
	}

}
