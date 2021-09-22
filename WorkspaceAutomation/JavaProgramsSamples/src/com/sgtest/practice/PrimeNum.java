package com.sgtest.practice;
class PrimeNumber
{
	void getPrime()
	{
		
		for(int i=2; i<=50; i++)
		{
			int a = 0;
			for(int j=2; j<i; j++)
			{
				if(i%j == 0)
				{
					a = 1;
					break;
				}
			}
			if(a==0)
			{
				System.out.print(i + "  ");
			}
		}
	}
}
public class PrimeNum {
	public static void main(String[] args) {
		PrimeNumber p = new PrimeNumber();
		p.getPrime();
		
	}
}
