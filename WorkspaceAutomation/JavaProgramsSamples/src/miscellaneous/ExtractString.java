package miscellaneous;

public class ExtractString {
	public static void main(String[] args) {
		//extractString1();
		//extractString2();
		//positionOfString();
		getCharArray();
	}
	
	static void extractString1()
	{
		String s = "Rohit";
		System.out.println(s.substring(4));
	}
	
	static void extractString2()
	{
		String s = "Programming";
		System.out.println(s.subSequence(3, 7));
	}
	
	static void positionOfString()
	{
		String s="xxaxxaxxaXXAXXA";
		System.out.println("Position of 'A' from Left:"+s.indexOf('A'));
		System.out.println("Position of 'A' from Right:"+s.lastIndexOf('A'));
		System.out.println("++++++++++++");
	}
	
	static void getCharArray()
	{
		String s="Oracle";
		char ch[]=s.toCharArray();
		for(char ch1:ch)
		{
			System.out.println(ch1+"  ");
		}
		System.out.println("++++++++++++");
	}
}
