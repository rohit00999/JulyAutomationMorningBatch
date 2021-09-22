package com.sgtest.constructorassign;

class TwoWheeler
{
	String BikeName;
	String Colour;
	int Price;
	int HighSpeed;
	int Model;
	int NumofWheels;
	TwoWheeler()
	{
		BikeName = "Pulsar 200-NS";
		Colour = "Black";
		Price = 123000;
		HighSpeed = 143;
		Model = 2018;
		NumofWheels = 2;
		System.out.println("Bike Name is : " + BikeName);
		System.out.println("Bike Colour is : " + Colour);
		System.out.println("Bike Price is : " + Price);
		System.out.println("Bike HighSpeed is : " + HighSpeed);
		System.out.println("Bike Model is : " + Model);
		System.out.println("Number of wheels : " + BikeName);
		System.out.println("**********************************************");
	}
}

class FourWheeler
{
	String CarName;
	String Colour;
	int Price;
	int HighSpeed;
	int NumofWheels;
	int Model;
	FourWheeler()
	{
		CarName = "Audi";
		Colour = "Black";
		Price = 3500000;
		HighSpeed = 245;
		Model = 2020;
		NumofWheels = 4;
		System.out.println("Car Name is : " + CarName);
		System.out.println("Car Colour is : " + Colour);
		System.out.println("Car Price is : " + Price);
		System.out.println("Car HighSpeed is : " + HighSpeed);
		System.out.println("Car Model is : " + Model);
		System.out.println("Number of wheels is : " + NumofWheels);

	}
	
}

public class NoArgsTwoAndFourWheeler {

	public static void main(String[] args) {
		
		TwoWheeler t1 = new TwoWheeler();
		FourWheeler f1 = new FourWheeler();
		
	}

}
