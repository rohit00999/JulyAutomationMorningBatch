package miscellaneous;

import java.util.ArrayList;
public class CollectionFramework {

	public static void main(String[] args) {
		displayNumbers();
	}
	// Print the Even Numbers From 1 to 20.. 
	static void displayNumbers()
	{
		int k = 0;
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i=1; i<=20; i++)
		{
			if(i%2 == 0)
			{
				a.add(k,i);
				k++;
			}
		}
		for(int i=0; i<a.size(); i++)
		{
			System.out.print(a.get(i) + "  ");
		}
	}
}
