package com.sgtest.classprgms;

class PrimeNum
{
	void getPrimeNum(int n) 
	{
		int flag = 0;
		{
			for(int i=2; i<=n/2; i++)
			{
				if(n%i== 0)
				{
					flag = flag + 1;
				}
			}
			if(flag==0)
			{
				System.out.println("the given number is prime");
			}else
			{
				System.out.println("the given number is not prime");
			}
		}
	}
	boolean rePrime(int n)
	{
		int flag = 0;
		{
			for(int i=2; i<=n/2; i++)
			{
				if(n%i== 0)
				{
					flag = flag + 1;
				}
			}
			if(flag==0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	}
}
public class PrimeNumOrNot {
	public static void main(String[] args) {

		PrimeNum pn = new PrimeNum();
		pn.getPrimeNum(3);
		int count=0;
		for(int i=100;i<=200;i++)
		{
			if (pn.rePrime(i)==true)
			{
				count++;
				System.out.println(i);
			}
		}
		System.out.println("prime count"+ count);
	}
}
