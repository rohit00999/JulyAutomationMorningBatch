package com.sgtest.oopsassign;

class TwoWheeler
{
	String BikeName;
	String Colour;
	int Price;
	int HighSpeed;
	int Model;
	int NumofWheels;
}

class FourWheeler
{
	String CarName;
	String Colour;
	int Price;
	int HighSpeed;
	int NumofWheels;
	int Model;
	
}

public class TwoWheelerFourWheeler {

	public static void main(String[] args) {
		
		TwoWheeler tw = new TwoWheeler();
		tw.BikeName = "Pulsar 200-NS";
		tw.Colour = "Black";
		tw.Price = 123000;
		tw.HighSpeed = 143;
		tw.Model = 2018;
		tw.NumofWheels = 2;
		System.out.println("Bike Name is : " + tw.BikeName);
		System.out.println("Bike Colour is : " + tw.Colour);
		System.out.println("Bike Price is : " + tw.Price);
		System.out.println("Bike HighSpeed is : " + tw.HighSpeed);
		System.out.println("Bike Model is : " + tw.Model);
		System.out.println("Number of wheels : " + tw.NumofWheels);
		
		System.out.println("**********************************************");
		
		FourWheeler fw = new FourWheeler();
		fw.CarName = "Audi";
		fw.Colour = "Black";
		fw.Price = 3500000;
		fw.HighSpeed = 245;
		fw.Model = 2020;
		fw.NumofWheels = 4;
		System.out.println("Car Name is : " + fw.CarName);
		System.out.println("Car Colour is : " + fw.Colour);
		System.out.println("Car Price is : " + fw.Price);
		System.out.println("Car HighSpeed is : " + fw.HighSpeed);
		System.out.println("Car Model is : " + fw.Model);
		System.out.println("Number of wheels is : " + fw.NumofWheels);
		
		


	}

}
