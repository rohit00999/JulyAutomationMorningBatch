package miscellaneous;

class Sample2
{
	Sample2(){
		this("Modi");
		System.out.println("Sample2: Default constructor");
	}
	
	Sample2(String name)
	{
		this(71);
		System.out.println("Sample2: 1 String param");
	}
	
	Sample2(int age){
		System.out.println("Sample2: 1 int param");
	}
}


public class ThisKeyword_ConstructorLevel {
	public static void main(String[] args) {
		Sample2 s1 = new Sample2();
	}
}
