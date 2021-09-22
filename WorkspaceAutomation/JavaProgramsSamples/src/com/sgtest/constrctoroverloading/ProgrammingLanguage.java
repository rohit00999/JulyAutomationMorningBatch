package com.sgtest.constrctoroverloading;

class Programs1
{
	Programs1(String pname, int found)
	{
		System.out.println("The name of Programming language is : " + pname);
		System.out.println("Found in year : " + found);
		
	}
	Programs1(long year, String author)
	{
		System.out.println("The Book published in year : " + year);
		System.out.println("Author of the Book : " + author);
	}
	Programs1(String names)
	{
		System.out.println("The name of programming language : " + names);
	}
}

public class ProgrammingLanguage {
	public static void main(String[] args) {
		
		Programs1 po1 = new Programs1("Core Java", 1999);
		Programs1 po2 = new Programs1(2000, "XYZ");
		Programs1 po3 = new Programs1("Python");
		

	}

}
