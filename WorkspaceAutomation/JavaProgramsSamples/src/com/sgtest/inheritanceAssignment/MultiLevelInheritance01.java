package com.sgtest.inheritanceAssignment;
class Sports
{
		void showSportname1(String sn)
		{
			System.out.println("Sports Name is : " + sn);
		}
	
}
class Cricket extends Sports
{
	void showSportname01(String sn)
	{
		System.out.println("This is Cricket Class : " + sn);
	}
}
class BasketBall extends Cricket
{
	void showSportname001(String sn)
	{
		System.out.println("This is BasketBall Class : " + sn);
	}
}
public class MultiLevelInheritance01 {
	public static void main(String[] args) {
		
		BasketBall bb = new BasketBall();
		bb.showSportname1("Cricket");
		bb.showSportname01("Hockey");
		bb.showSportname001("Football");
	}

}
