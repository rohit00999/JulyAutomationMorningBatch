package com.sgtest.inheritanceAssignment;
class QQ
{
	QQ(String name, int age)
	{
		System.out.println("The QQ name is : " + name);
		System.out.println("The QQ age is : " + age);
	}
	QQ(String ID)
	{
		System.out.println("The QQ ID is : " + ID);
	}
	
}
class WW extends QQ
{
	WW(String Bookname)
	{
		super(Bookname);
		System.out.println("WW BookNAme is : " + Bookname);
	}
	WW(String xx, int Bookid)
	{
		super(xx, Bookid);
		System.out.println("The WW is : " + xx);
		System.out.println("The WW is : " + Bookid);
		
	}
}
class EE extends WW 
{
	EE(String yy)
	{
		super(yy);
		System.out.println("The Last Name is : " + yy);
	}
	EE(String aa, int pp)
	{
		super(aa,pp);
		System.out.println("The EE is : " + aa);
		System.out.println("The EE is : " + pp);
	}
}
public class SuperParamMultilevelOL {
	public static void main(String[] args) {
		EE e = new EE("Sachin", 45);
		EE o = new EE("core java");
		
		
		
	}

}
