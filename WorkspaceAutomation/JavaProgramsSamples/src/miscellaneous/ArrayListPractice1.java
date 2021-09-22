package miscellaneous;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListPractice1 {

	public static void main(String[] args) {
		//addElements();
		//removeElements();
		//readElements1();
		//readElements2();
		//readElements3();
		rawApproach();
	}
	
	static void addElements()
	{
		List<String> a = new ArrayList<String>();
		a.add("Apple");
		a.add("Mango");
		a.add("Pineapple");
		a.add(0, "Banana");
		System.out.println(a);
		List<String> a1 = new ArrayList<String>();
		a1.add("Abc");
		a1.add("ABC");
		a1.add("Xyz");
		a.addAll(a1);
		System.out.println(a);
	}
	
	static void removeElements()
	{
		List<String> a = new ArrayList<String>();
		a.add("Rohit");
		a.add("Sagar");
		a.add(0, "Vinay");
		a.add("Santhosh");
		System.out.println(a);
		a.remove(0);
		System.out.println(a);
		a.remove("Sagar");
		System.out.println(a);
		a.removeAll(a);
		System.out.println(a);
	}
	
	static void readElements1()
	{
		List<String> a = new ArrayList<String>();
		a.add("Rohit");
		a.add("Sagar");
		a.add(0, "Vinay");
		a.add("Santhosh");
		System.out.println(a);
		for(String k : a)
		{
			System.out.println(k);
		}
	}
	
	static void readElements2()
	{
		List<String> a = new ArrayList<String>();
		a.add("Rohit");
		a.add("Sagar");
		a.add(0, "Vinay");
		a.add("Santhosh");
		System.out.println(a);
		for(int i=0; i<a.size(); i++)
		{
			System.out.println(a.get(i));
		}
	}
	
	static void readElements3()
	{
		List<String> a = new ArrayList<String>();
		a.add("Rohit");
		a.add("Sagar");
		a.add(0, "Vinay");
		a.add("Santhosh");
		System.out.println(a);
		Iterator<String> ite = a.iterator();
		while(ite.hasNext())
		{
			System.out.println(ite.next());
		}
	}
	
	static void rawApproach()
	{
		ArrayList a = new ArrayList();
		a.add(10.75);
		a.add(true);
		a.add("India");
		a.add(100);
		System.out.println(a);	
	}
}
