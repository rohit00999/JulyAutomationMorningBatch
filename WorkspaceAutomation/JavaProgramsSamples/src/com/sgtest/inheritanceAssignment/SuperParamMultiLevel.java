package com.sgtest.inheritanceAssignment;
class AAA
{
	AAA(String firstname)
	{
		System.out.println("AAA name is : " + firstname);
	}
}
class BBB extends AAA
{
	BBB(String firstname)
	{
		super(firstname);
		System.out.println("BBB Class : " + firstname);
	}
}
class CCC extends BBB
{
	CCC(String firstname)
	{
		super(firstname);
		System.out.println("CCC class : " + firstname);
	}
}
public class SuperParamMultiLevel {
	public static void main(String[] args) {
		
		CCC c = new CCC("ABCD");
	}

}
