package com.sgtest.classprgms;

class Sample2
{
	static String name;

	public static void displayName() {
		System.out.println("Name: Modi");
	}

	static {
		System.out.println("Sample2: static block 1");
		name = "Kalam";
		System.out.println("Name is: " + name);

		displayName();
		System.out.println("*******************");
	}

	static {
		System.out.println("Sample2: static block 2");
		System.out.println("*******************");
	}

	{
		System.out.println("Sample2: instance block 1");
		System.out.println("*******************");
	}

	Sample2(){
		System.out.println("Sample2: Default constructor");
		System.out.println("*******************");
	}
}

public class StaticBlock {
	public static void main(String[] args) {
		Sample2 s = new Sample2();
		Sample2.displayName();
		//fact();
	}
	/*static  void fact()
	{
		System.out.println("xyz");
	}*/
}
