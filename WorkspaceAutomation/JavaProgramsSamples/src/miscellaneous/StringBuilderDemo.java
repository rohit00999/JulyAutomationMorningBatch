package miscellaneous;

public class StringBuilderDemo {

	public static void main(String[] args) {
		//appendDemo();
		//insertDemo();
		//deleteDemo();
		reverseDemo();
	}
	
	static void appendDemo()
	{
		StringBuilder s=new StringBuilder("Rohit");
		s.append(" k");
		System.out.println(s);
		System.out.println("++++++++++");
	}
	
	static void insertDemo()
	{
		StringBuilder s = new StringBuilder("I am going to ");
		s.insert(13, " Temple");
		System.out.println(s);
		System.out.println("++++++++++");
	}
	
	static void deleteDemo()
	{
		StringBuilder s = new StringBuilder("Rohit Kulkarni");
		s.delete(6, 14);
		System.out.println(s);
		System.out.println("++++++++++");
	}
	
	static void reverseDemo()
	{
		StringBuilder s = new StringBuilder("I am going to Temple");
		s.reverse();
		System.out.println(s);
		
	}
}
