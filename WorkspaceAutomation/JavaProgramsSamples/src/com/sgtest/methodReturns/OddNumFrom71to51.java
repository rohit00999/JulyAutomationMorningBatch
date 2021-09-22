package com.sgtest.methodReturns;
class OddNums{
	int count()
	{
		int count=0;
		for(int i=71;i>=51;i--)
		{
			if(i%2==1)
			{
				count++;
			}
		}return count;
	}

	int[] returnOddNums()
	{

		int k=0;
		int[] a=new int[count()];


		for(int i=71;i>=51;i--)
		{
			if(i%2==1)
			{
				a[k]=i;
				k++;
			}
		}
		return a;
	}
}

public class OddNumFrom71to51 {

	public static void main(String[] args) {

		OddNums o=new OddNums();
		int b[]=o.returnOddNums();
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	}

}
