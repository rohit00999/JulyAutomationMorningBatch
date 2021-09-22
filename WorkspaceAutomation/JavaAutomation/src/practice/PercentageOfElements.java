package practice;

public class PercentageOfElements {

	public static void main(String[] args) {

		int uppercaseCount = 0;
		int lowercaseCount = 0;
		int digitsCount = 0;
		int SpecCharCount = 0;

		String s = "Rohit Suhas"; 

		for(int i=0; i<s.length(); i++)
		{
			char c = s.charAt(i);
			{
				if(Character.isUpperCase(c))
				{
					uppercaseCount++;
				}
				else if(Character.isLowerCase(c)){

					lowercaseCount++;	
				}
				else if(Character.isDigit(c)){

					digitsCount++;
				}
				else{

					SpecCharCount++;
				}
			}
		}
		double upperPercentage = (uppercaseCount * 100)/s.length();
		double lowerPercentage = (lowercaseCount * 100)/s.length();
		double digitsPercentage = (digitsCount * 100)/s.length();
		double SpecCharPercentage = (SpecCharCount * 100)/s.length();
		
		System.out.println("The Given String is : " + s);
		System.out.println("The UpperCase Count is :  " + upperPercentage );
		System.out.println("The lowercaseCount Count is :  " + lowerPercentage );
		System.out.println("The digitsCount Count is :  " + digitsPercentage );
		System.out.println("The SpecCharCount Count is :  " + SpecCharPercentage );
		
		System.out.println(s.length());
	}

}




