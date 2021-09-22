package miscellaneous;

public class StringBufferDemo {
	public static void main(String[] args) {
		appendDemo();
	}
	
	static void appendDemo()
	{
		StringBuffer s=new StringBuffer("Rohit");
		s.append(" kulkarni");
		System.out.println(s);
		System.out.println("++++++++++");
	}
}
