package com.sgtest.constructorassign;

class Student1
{
	String StudentName;
	int age;
	int StudentId;
	String DOB;
	String City;
	Student1(String name, int age1, int id, String Dob, String city)
	{
		StudentName = name;
		age = age1;
		StudentId = id;
		DOB = Dob;
		City = city;
		System.out.println("The Student name is : " + StudentName);
		System.out.println("The Student age is : " + age);
		System.out.println("The StudentId is : " + StudentId);
		System.out.println("The Student DOB is : " + DOB);
		System.out.println("The Student City name is : " + City);
		
		System.out.println("***************************************************************");
	}
	
}

class Library1
{
	String BookName;
	int BookId;
	String IssueDate;
	String ReceiveDate;
	Library1(String bookname, int id, String idate, String rdate)
	{
		BookName = bookname;
		BookId = id;
		IssueDate = idate;
		ReceiveDate = rdate;
		System.out.println("The BookName is : " + BookName);
		System.out.println("The Book ID is : " + BookId);
		System.out.println("The IssueDate is : " + IssueDate);
		System.out.println("The Receive Date is : " + ReceiveDate);
		
		System.out.println("***************************************************************");
	}
}

class Sports1
{
	String SportName;
	int TotalScore;
	String MVP;
	String MatchWon;
	Sports1(String sportname, int score, String mvp, String won)
	{
		SportName = sportname;
		TotalScore = score;
		MVP = mvp;
		MatchWon = won;
		System.out.println("The Sport name is : " + SportName);
		System.out.println("The Total Score is : " + TotalScore);
		System.out.println("The MVP of the Match is : " + MVP);
		System.out.println("Match won by : " + MatchWon);
	}
}

public class ParamStuSpoCompDept {

	public static void main(String[] args) {
		
		Student1 s1 = new Student1("Sachin", 20, 1001, "**/**/****", "Bangalore");
		Library1 l1 = new Library1("Java Progamming", 4343, "**/**/****", "**/**/****");
		Sports1 sp1  = new Sports1("Cricket", 350, "Rohit", "India");
	}

}
