 package com.sgtest.constructoroverchaining;

class Library01
{
	Library01(String libname)
	{
		System.out.println("The library name is : " + libname);
	}
	Library01(int bprice)
	{
		System.out.println("The book cost is : " + bprice);
	}
	Library01(String Idate, String Rdate)
	{
		this(3890);
		System.out.println("Book issue date : " + Idate);
		System.out.println("Book Received date : " + Rdate);
	}
}

public class Library {
	public static void main(String[] args) {
		
		Library01 lb1 = new Library01("ZYX");
		Library01 lb2 = new Library01("23/07/2021", "27/07/2021");

	}

}
