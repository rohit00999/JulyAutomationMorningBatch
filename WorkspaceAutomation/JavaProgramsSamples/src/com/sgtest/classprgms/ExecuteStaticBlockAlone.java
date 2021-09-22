package com.sgtest.classprgms;

class Sample3
{
	Sample3(){
		System.out.println("Sample3: Default constructor");
	}
	
	{
		System.out.println("Sample3: Instance block");
	}
	
	static {
		System.out.println("Sample3: static block");
	}
}

public class ExecuteStaticBlockAlone {
	public static void main(String[] args) {
		//Class is class in java. forName() is a static method inside
		//the class Class, it accepts class name as a argument. Hence we
		//have to pass the class name prefixed with package name.
		//As the method .forName() is a checked exception hence we have
		//to use try and catch block
		
		/*try {
			Class.forName("staticMembers.Sample3");
		}catch(Exception e)
		{
			System.out.println(e);
		}*/
	}
}
