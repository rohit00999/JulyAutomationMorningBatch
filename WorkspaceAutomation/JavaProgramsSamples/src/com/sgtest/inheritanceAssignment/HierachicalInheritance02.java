package com.sgtest.inheritanceAssignment;
class Country
{
	void displayCountryname(String cn)
	{
		System.out.println("The Country Name is : " + cn);
	}
}
class State extends Country
{
	void displayStatename(String sn)
	{
		System.out.println("The state name is : " + sn);
	}
}
class District extends Country
{
	void displayDistrictname(String dn)
	{
		System.out.println("The district name is : " + dn);
	}
}
public class HierachicalInheritance02 {
	public static void main(String[] args) {
		
		State st = new State();
		st.displayCountryname("India");
		st.displayStatename("Karnataka");
		
		District dt = new District();
		dt.displayCountryname("India");
		dt.displayDistrictname("Bangalore");
		
	}

}
