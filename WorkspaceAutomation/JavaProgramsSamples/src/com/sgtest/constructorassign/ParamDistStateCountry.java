package com.sgtest.constructorassign;

class District1
{
	String DistName;
	String WhichState;
	int NumofPopulation;
	int NumofTalukas;
	double DistArea;
	District1(String distname, String state, int population, int talukas, double area)
	{
		DistName = distname;
		WhichState = state;
		NumofPopulation = population;
		NumofTalukas = talukas;
		DistArea = area;
		System.out.println("District Name is : " + DistName);
		System.out.println("District Belongs to which State : " + WhichState);
		System.out.println("District Population is : " + NumofPopulation);
		System.out.println("Number of Talukas in District is : " + NumofTalukas);
		System.out.println("District Area is : " + DistArea);
		System.out.println("********************************************************");
	}
}
class State1
{
	String StateName;
	String WhichCountry;
	long Population;
	String Language;
	int NumofDist;
	double Area;
	State1(String statename, String country, long population, String lang, int dist, double area)
	{
		StateName = statename;
		WhichCountry = country;
		Population = population;
		Language = lang;
		NumofDist = dist;
		Area = area;
		System.out.println("State Name is : " + StateName);
		System.out.println("State Belongs to which Country : " + WhichCountry);
		System.out.println("State Population is : " + Population);
		System.out.println("State Language is : " + Language);
		System.out.println("Number of Districts are : " + NumofDist);
		System.out.println("State Area is : " + Area);
		System.out.println("*******************************************************************");
	}
}

class Country1
{
	String CountryName;
	String Continent;
	long Population;
	int NumofLanguages;
	int NumofStates;
	String NaionalAnimal;
	Country1(String countryname, String conti, long population, int lang, int states, String animal)
	{
		CountryName = countryname;
		Continent = conti;
		Population = population;
		NumofLanguages = lang;
		NumofStates = states;
		NaionalAnimal = animal;
		System.out.println("Country Name is : " + CountryName);
		System.out.println("Country Belongs to which Continent : " + Continent);
		System.out.println("Country Population is : " + Population);
		System.out.println("The Number of Language in the country : " + NumofLanguages);
		System.out.println("Number of States are : " + NumofStates);
		System.out.println("Country National Animal is : " + NaionalAnimal);
	}
}

public class ParamDistStateCountry {
	public static void main(String[] args) {
		
		 District1 di1 = new District1("Bangalore","Karnataka", 8000000, 8, 210.69);
		 State1 se1 = new State1("Karnataka","India", 80000000, "Kannada", 31, 304.54);
		 Country1 ct1 = new Country1("India", "Asia", 1250000000, 80, 30, "Tiger");
		
	}

}
