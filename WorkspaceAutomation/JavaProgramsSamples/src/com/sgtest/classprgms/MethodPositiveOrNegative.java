package com.sgtest.classprgms;

class PositiveOrNegative
{
	boolean num(int a)
	{
		if(a>=0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}	
}

public class MethodPositiveOrNegative {
	public static void main(String[] args) {

		PositiveOrNegative pn = new PositiveOrNegative();
		boolean b = pn.num(10);
		System.out.println(b);
	}
}
