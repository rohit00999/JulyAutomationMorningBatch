package com.sgtest.oopsassign;

class Student
{
	String StudentName;
	int age;
	int StudentId;
	String DOB;
	String City;
	
}

class Library
{
	String BookName;
	int BookId;
	String IssueDate;
	String ReceiveDate;
}

class Sports
{
	String SportName;
	int TotalScore;
	String MVP;
	String MatchWon;
}

public class StudLibSports {

	public static void main(String[] args) {
		
		Student sn = new Student();
		sn.StudentName = "ABCD";
		sn.age = 19;
		sn.StudentId = 4321;
		sn.DOB = "**/**/****";
		sn.City = "Mangalore";
		System.out.println("The Student name is : " + sn.StudentName);
		System.out.println("The Student age is : " + sn.age);
		System.out.println("The StudentId is : " + sn.StudentId);
		System.out.println("The Student DOB is : " + sn.DOB);
		System.out.println("The Student City name is : " + sn.City);
		
		System.out.println("***************************************************************");
		
		Library ll = new Library();
		ll.BookName = "JavaProgamming";
		ll.BookId = 321;
		ll.IssueDate = "##/##/####";
		ll.ReceiveDate = "&&/&&/&&&&";
		System.out.println("The BookName is : " + ll.BookName);
		System.out.println("The Book ID is : " + ll.BookId);
		System.out.println("The IssueDate is : " + ll.IssueDate);
		System.out.println("The Receive Date is : " + ll.ReceiveDate);
		
		System.out.println("***************************************************************");
		
		Sports ss = new Sports();
		ss.SportName = "Cricket";
		ss.TotalScore = 231;
		ss.MVP = "Sachin";
		ss.MatchWon = "India";
		System.out.println("The Sport name is : " + ss.SportName);
		System.out.println("The Total Score is : " + ss.TotalScore);
		System.out.println("The MVP of the Match is : " + ss.MVP);
		System.out.println("Match won by : " + ss.MatchWon);

	}

}
