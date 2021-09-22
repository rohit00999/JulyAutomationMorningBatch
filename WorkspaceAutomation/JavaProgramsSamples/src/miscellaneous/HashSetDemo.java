package miscellaneous;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
			addElements();
		//	removeElements();
		//	readElements1();
		//	readElements2();
		//	readElements3();
		//	rawApproach();

	}
	
	static void addElements()
	{
		HashSet<String> obj=new HashSet<String>();
		System.out.println("Elements:"+obj);
		obj.add("Orange");
		obj.add("Apple");
		obj.add("Mango");
		obj.add("Orange");
		obj.add("Banana");
		System.out.println("Elements:"+obj);
		HashSet<String> obj1=new HashSet<String>();
		obj1.add("White");
		obj1.add("Green");
		obj1.add("Blue");
		obj.addAll(obj1);
		System.out.println("Elements:"+obj);
	}
	
	static void removeElements()
	{
		HashSet<String> obj=new HashSet<String>();
		System.out.println("Elements:"+obj);
		obj.add("Orange");
		obj.add("Apple");
		obj.add("Mango");
		obj.add("Pineapple");
		obj.add("Banana");
		System.out.println("Elements:"+obj);
		obj.remove("Mango");
		System.out.println("Elements:"+obj);
		obj.removeAll(obj);
		System.out.println("Elements:"+obj);
	}
	
	static void readElements1()
	{
		HashSet<String> obj=new HashSet<String>();
		System.out.println("Elements:"+obj);
		obj.add("Orange");
		obj.add("Apple");
		obj.add("Mango");
		obj.add("Pineapple");
		obj.add("Banana");
		System.out.println("Elements:"+obj);
		for(String kk:obj)
		{
			System.out.println(kk);
		}
	}
	
	static void readElements2()
	{
		HashSet<String> obj=new HashSet<String>();
		System.out.println("Elements:"+obj);
		obj.add("Orange");
		obj.add("Apple");
		obj.add("Mango");
		obj.add("Pineapple");
		obj.add("Banana");
		System.out.println("Elements:"+obj);
		Iterator<String> ite=obj.iterator();
		while(ite.hasNext())
		{
			System.out.println(ite.next());
		}
	}
	
	static void readElements3()
	{
		HashSet<String> obj=new HashSet<String>();
		System.out.println("Elements:"+obj);
		obj.add("Orange");
		obj.add("Apple");
		obj.add("Mango");
		obj.add("Pineapple");
		obj.add("Banana");
		System.out.println("Elements:"+obj);
		Object a[]=obj.toArray();
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	
	static void rawApproach()
	{
		HashSet obj=new HashSet();
		System.out.println("Elements:"+obj);
		obj.add(true);
		obj.add(10);
		obj.add(2.75);
		obj.add('Y');
		System.out.println("Elements:"+obj);
	}

}
