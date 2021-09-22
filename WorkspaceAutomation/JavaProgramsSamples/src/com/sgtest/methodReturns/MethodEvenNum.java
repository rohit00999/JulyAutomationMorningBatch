package com.sgtest.methodReturns;
class EvenNumFrom20to40
{
	int count=0;
	int count()
	{
		for(int i=20;i<=40;i++)
		{
			if(i%2==0)
			{
				count=count+1;
			}
		}
		return count;
	}
	int [] returnEvenNumArray(int x,int y)
	{
		int a[]=new int[count()];
		int k=0;
		for(int i=x;i<=y;i++)
		{
			if(i%2==0)
			{
				a[k]=i;
				k++;
			}
		}
		return a;
	}
}
public class MethodEvenNum {

	public static void main(String[] args) {
		EvenNumFrom20to40 o = new EvenNumFrom20to40();
		int b[] = o.returnEvenNumArray(20, 40);
		for(int i=0; i<b.length; i++)
		{
			System.out.println(b[i]);
		}
	}

}
