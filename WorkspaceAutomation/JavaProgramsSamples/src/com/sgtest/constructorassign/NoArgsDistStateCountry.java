package com.sgtest.constructorassign;

class District
{
	String DistName;
	String WhichState;
	int NumofPopulation;
	int NumofTalukas;
	double DistArea;
	District()
	{
		DistName = "Koppal";
		WhichState = "Karnataka";
		NumofPopulation = 2000000;
		NumofTalukas = 5;
		DistArea = 153.45;
		System.out.println("District Name is : " + DistName);
		System.out.println("District Belongs to which State : " + WhichState);
		System.out.println("District Population is : " + NumofPopulation);
		System.out.println("Number of Talukas in District is : " + NumofTalukas);
		System.out.println("District Area is : " + DistArea);
		System.out.println("********************************************************");
	}
}

class State
{
	String StateName;
	String WhichCountry;
	long Population;
	String Language;
	int NumofDist;
	double Area;
	State()
	{
		StateName = "Karnataka";
		WhichCountry = "India";
		Population = 50000000;
		Language = "Kannada";
		NumofDist = 31;
		Area = 400.12;
		System.out.println("State Name is : " + StateName);
		System.out.println("State Belongs to which Country : " + WhichCountry);
		System.out.println("State Population is : " + Population);
		System.out.println("State Language is : " + Language);
		System.out.println("Number of Districts are : " + NumofDist);
		System.out.println("State Area is : " + Area);		
		System.out.println("*******************************************************************");
	}
}

class Country
{
	String CountryName;
	String Continent;
	long Population;
	int NumofLanguages;
	int NumofStates;
	String NaionalAnimal;
	Country()
	{
		CountryName = "India";
		Continent ="Asia";
		Population = 1250000000;
		NumofLanguages = 34;
		NumofStates = 30;
		NaionalAnimal = "Tiger";
		System.out.println("Country Name is : " + CountryName);
		System.out.println("Country Belongs to which Continent : " + Continent);
		System.out.println("Country Population is : " + Population);
		System.out.println("The Number of Language in the country : " + NumofLanguages);
		System.out.println("Number of States are : " + NumofStates);
		System.out.println("Country National Animal is : " + NaionalAnimal);

	}
}

public class NoArgsDistStateCountry {
	public static void main(String[] args) {

		District d1 = new District();
		State s1 = new State();
		Country c1 = new Country();

	}

}
