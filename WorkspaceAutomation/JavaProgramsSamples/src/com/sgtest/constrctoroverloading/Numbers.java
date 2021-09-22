package com.sgtest.constrctoroverloading;

class Num
{
	Num()
	{
		for(int i=10; i<=20; i++)
		{
			System.out.println("The Numbers from 10 to 20 are : " + i);
		}
	}
}

public class Numbers {
	public static void main(String[] args) {
		
		Num nu = new Num();

	}

}
