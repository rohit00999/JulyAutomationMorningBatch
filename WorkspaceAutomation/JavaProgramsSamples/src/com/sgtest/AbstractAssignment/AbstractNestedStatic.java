package com.sgtest.AbstractAssignment;
class WW{
	String a;
	int v;
	Branch brh=new Branch();
	static class Branch{
		void jacky()
		{
			WW b=new WW();
			b.a="XYZ";
			b.v=50;
			System.out.println("Name :"+b.a);
			System.out.println("Age : " + b.v);
		}
	}
}
public class AbstractNestedStatic {
	public static void main(String[] args) {
		WW ob=new WW();
		ob.brh.jacky();
	}
}
