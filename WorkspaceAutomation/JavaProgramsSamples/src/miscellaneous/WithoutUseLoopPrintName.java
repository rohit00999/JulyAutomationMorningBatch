package miscellaneous;
class Example
{
	static int count = 5;
	static void displayName()
	{	
		String s = "Rohit";
		if(count>0)
		{
			System.out.println(s);
			count--;
			displayName();
		}
	}
}
public class WithoutUseLoopPrintName {
	public static void main(String[] args) {
		Example.displayName();

	}
}
