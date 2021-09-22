package com.sgtest.constructorassign;

class TwoWheeler1
{
	String BikeName;
	String Colour;
	int Price;
	int HighSpeed;
	int Model;
	int NumofWheels;
	TwoWheeler1(String bikename, String colour, int price, int hspeed, int model, int wheels)
	{
		BikeName = bikename;
		Colour = colour;
		Price = price;
		HighSpeed = hspeed;
		Model = model;
		NumofWheels = wheels;
		System.out.println("Bike Name is : " + BikeName);
		System.out.println("Bike Colour is : " + Colour);
		System.out.println("Bike Price is : " + Price);
		System.out.println("Bike HighSpeed is : " + HighSpeed);
		System.out.println("Bike Model is : " + Model);
		System.out.println("Number of wheels : " + NumofWheels);
		System.out.println("**********************************************");
	}
}

class FourWheeler1
{
	String CarName;
	String Colour;
	int Price;
	int HighSpeed;
	int Model;
	int NumofWheels;
	FourWheeler1(String carname, String paint, int price, int highspeed,int model, int numwheels)
	{
		CarName = carname;
		Colour = paint;
		Price = price;
		HighSpeed = highspeed;
		Model = model;
		NumofWheels = numwheels;
		System.out.println("Car Name is : " + CarName);
		System.out.println("Car Colour is : " + Colour);
		System.out.println("Car Price is : " + Price);
		System.out.println("Car HighSpeed is : " + HighSpeed);
		System.out.println("Car Model is : " + Model);
		System.out.println("Number of wheels is : " + NumofWheels);
		
	}
	
}

public class ParamTwoAndFourWheeler {

	public static void main(String[] args) {
		
		TwoWheeler1 te = new TwoWheeler1("Pulsar-200NS", "Black n Grey", 123000, 145, 2018,2);
		FourWheeler1 fe = new FourWheeler1("Audi", "Grey", 200000, 300, 2019, 4);
	
	}

}
