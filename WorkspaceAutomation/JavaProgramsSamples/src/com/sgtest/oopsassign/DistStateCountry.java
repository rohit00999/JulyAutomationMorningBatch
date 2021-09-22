package com.sgtest.oopsassign;

class District
{
	String DistName;
	String WhichState;
	int NumofPopulation;
	int NumofTalukas;
	double DistArea;
}

class State
{
	String StateName;
	String WhichCountry;
	long Population;
	String Language;
	int NumofDist;
	double Area;
}

class Country
{
	String CountryName;
	String Continent;
	long Population;
	int NumofLanguages;
	int NumofStates;
	String NaionalAnimal;
}

public class DistStateCountry {
	public static void main(String[] args) {
		
		District di = new District();
		di.DistName = "Koppal";
		di.WhichState = "Karnataka";
		di.NumofPopulation = 2000000;
		di.NumofTalukas = 5;
		di.DistArea = 153.45;
		System.out.println("District Name is : " + di.DistName);
		System.out.println("District Belongs to which State : " + di.WhichState);
		System.out.println("District Population is : " + di.NumofPopulation);
		System.out.println("Number of Talukas in District is : " + di.NumofTalukas);
		System.out.println("District Area is : " + di.DistArea);
		
		System.out.println("********************************************************");
		
		State st = new State();
		st.StateName = "Karnataka";
		st.WhichCountry = "India";
		st.Population = 50000000;
		st.Language = "Kannada";
		st.NumofDist = 31;
		st.Area = 400.12;
		System.out.println("State Name is : " + st.StateName);
		System.out.println("State Belongs to which Country : " + st.WhichCountry);
		System.out.println("State Population is : " + st.Population);
		System.out.println("State Language is : " + st.Language);
		System.out.println("Number of Districts are : " + st.NumofDist);
		System.out.println("State Area is : " + st.Area);
		
		System.out.println("*******************************************************************");
		
		Country cc = new Country();
		cc.CountryName = "India";
		cc.Continent ="Asia";
		cc.Population = 1250000000;
		cc.NumofLanguages = 34;
		cc.NumofStates = 30;
		cc.NaionalAnimal = "Tiger";
		System.out.println("Country Name is : " + cc.CountryName);
		System.out.println("Country Belongs to which Continent : " + cc.Continent);
		System.out.println("Country Population is : " + cc.Population);
		System.out.println("The Number of Language in the country : " + cc.NumofLanguages);
		System.out.println("Number of States are : " + cc.NumofStates);
		System.out.println("Country National Animal is : " + cc.NaionalAnimal);
		
	}

}
