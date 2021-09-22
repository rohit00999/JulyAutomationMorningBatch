package com.sgtest.constructorassign;

class Student
{
	String StudentName;
	int age;
	int StudentId;
	String DOB;
	String City;
	Student()
	{
		StudentName = "ABCD";
		age = 19;
		StudentId = 4321;
		DOB = "**/**/****";
		City = "Mangalore";
		System.out.println("The Student name is : " + StudentName);
		System.out.println("The Student age is : " + age);
		System.out.println("The StudentId is : " + StudentId);
		System.out.println("The Student DOB is : " + DOB);
		System.out.println("The Student City name is : " + City);
		System.out.println("********************************************************");
		
	}
}

class Library
{
	String BookName;
	int BookId;
	String IssueDate;
	String ReceiveDate;
	Library()
	{
		BookName = "JavaProgamming";
		BookId = 321;
		IssueDate = "##/##/####";
		ReceiveDate = "&&/&&/&&&&";
		System.out.println("The BookName is : " + BookName);
		System.out.println("The Book ID is : " + BookId);
		System.out.println("The IssueDate is : " + IssueDate);
		System.out.println("The Receive Date is : " + ReceiveDate);
		
		System.out.println("***************************************************************");
	}
}

class Sports
{
	String SportName;
	int TotalScore;
	String MVP;
	String MatchWon;
	Sports()
	{
		SportName = "Cricket";
		TotalScore = 231;
		MVP = "Sachin";
		MatchWon = "India";
		System.out.println("The Sport name is : " + SportName);
		System.out.println("The Total Score is : " + TotalScore);
		System.out.println("The MVP of the Match is : " + MVP);
		System.out.println("Match won by : " + MatchWon);
	}
}


public class NoArgsStuSpoComDept {

	public static void main(String[] args) {
		
		Student ss = new Student();
		Library ll = new Library();
		Sports st = new Sports();
		
	}

}
