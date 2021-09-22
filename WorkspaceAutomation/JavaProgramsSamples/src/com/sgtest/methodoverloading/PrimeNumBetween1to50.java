package com.sgtest.methodoverloading;

class PrimeNum
{
	void displayPrimeNum(int num)
	{
		int a = 0;
		int n = 0;
		String primeNum = " ";
		
		for(int i=1; i<=50; i++)
		{
			int count = 0;
			for(n=i; n>=1; n--)
			{
				if(i%n == 0)
				{
					count = count + 1;
					break;
				}
			}
		}
	}
}

public class PrimeNumBetween1to50 {
	public static void main(String[] args) {
		
		PrimeNum pn = new PrimeNum();
		pn.displayPrimeNum(50);
	}

}
