package miscellaneous;

class Sample1
{
	String name;
	int age;
	
	public void a() {
		System.out.println("method a()");
	}
	
	public void b() {
		System.out.println("method b()");
	}
	
	Sample1(){
		System.out.println("Default constructor");
		this.name = "Kalam";
		this.age = 71;
		System.out.println("Name: "+ this.name +" & age: "+this.age);
		
		this.a();
		this.b();
	}
	
	public void instanceMethod() {
		System.out.println("Instance method");
		this.name = "Modi";
		this.age = 70;
		System.out.println("Name: "+ this.name +" & age: "+this.age);
		
		this.a();
		this.b();
	}
}


public class ThisKeyword_At_Method_Variable_Level {
	public static void main(String[] args) {
		Sample1 s = new Sample1();
		
		System.out.println("****************************");
		
		s.instanceMethod();
	}
}
