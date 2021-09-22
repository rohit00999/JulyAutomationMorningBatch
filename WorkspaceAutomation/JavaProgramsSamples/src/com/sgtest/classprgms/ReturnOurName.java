package com.sgtest.classprgms;

class Names
{
	String  name(String x)
	{
		return x;
	}
	
}
public class ReturnOurName {
	public static void main(String[] args) {
		Names ns = new Names();
		String a = ns.name("Rohit");
		System.out.println(a);

	}

}
