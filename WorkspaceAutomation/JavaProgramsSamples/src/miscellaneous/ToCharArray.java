package miscellaneous;

public class ToCharArray {

	public static void main(String[] args) {
		//toCharArray();
		splitString();
	}

	static void toCharArray()
	{
		String s = "Rohit";
		char ch[] = s.toCharArray();
		for(char ch1:ch)
		{
			System.out.println(ch1);
		}	
	}
	
	static void splitString()
	{
		String s = "apple, banana, mango, grape";
		String s1[] = s.split(",");
		for(String k : s1)
		{
			System.out.print(k);
		}
	}
}
