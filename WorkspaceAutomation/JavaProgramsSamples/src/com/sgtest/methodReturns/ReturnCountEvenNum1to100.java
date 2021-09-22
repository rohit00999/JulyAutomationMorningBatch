package com.sgtest.methodReturns;
class EvenNumFrom1to100{
	int count=0;
	int count()
	{
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
			{
				count=count+1;
			}
		}
		return count;
	}
}
	
public class ReturnCountEvenNum1to100 {

	public static void main(String[] args) {
		EvenNumFrom1to100 o = new EvenNumFrom1to100 ();
		int s=o.count();
		System.out.println(s);
	}
}
