package com.sgtest.constrctoroverloading;

class Dept
{
	Dept(int deptno)
	{
		System.out.println("Deparment No. is :  " + deptno);
	}
	Dept(String deptname, int facultyno)
	{
		System.out.println("Department Name : " + deptname);
		System.out.println("Number of Faculty : " + facultyno);
	}
	Dept(char firstltr)
	{
		System.out.println("First letter of Dept name : " + firstltr);
	}
	Dept(String labname, String HOD)
	{
		System.out.println("Lab Name : " + labname + "   " + " HOD Name : " + HOD);
	}
}

public class Deparments {
	public static void main(String[] args) {

		Dept d1 = new Dept(5);
		Dept d2 = new Dept("CS", 15);
		Dept d3 = new Dept('R');
		Dept d4 = new Dept("CoreJava", "XYZ");
	}

}
