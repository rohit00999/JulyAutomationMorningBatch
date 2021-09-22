package com.sgtest.classprgms;
abstract class Demo001
{
	static
	{
		System.out.println("The given block is Static Block");
	}
}
class Demo0001 extends Demo001
{
	
}
public class AbstractClassStaticMethod {
	public static void main(String[] args) {
		
		Demo0001 d = new Demo0001();	
	}
}
