package miscellaneous;

public class WithoutUsingBufferAndBuilderReverseTheString {

	public static void main(String[] args) {
		reverseTheString();
	}
	
	static void reverseTheString()
	{
		String s = "ABCD";
		int l = s.length();
		String rev = "";
		for(int i=l-1; i>=0; i--)
		{
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
	}
}
