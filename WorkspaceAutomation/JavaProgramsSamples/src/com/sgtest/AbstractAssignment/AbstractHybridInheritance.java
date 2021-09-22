package com.sgtest.AbstractAssignment;
abstract class Chocolate{
	void chocky(String a)
	{
		System.out.println(a);
	}
}
class Kitkat extends Chocolate{
	Kitkat(String b)
	{
		super.chocky(b);
	}
}
class Cadburry extends Chocolate{
	Cadburry(String a)
	{
		super.chocky(a);
	}
}
class Munch extends Cadburry{
	Munch(String aa)
	{
		super(aa);
	}
}
public class AbstractHybridInheritance {
	public static void main(String[] args) {
		Munch cho=new Munch("ChocoSeed");
		Kitkat kit=new Kitkat("Sugar");

	}

}
