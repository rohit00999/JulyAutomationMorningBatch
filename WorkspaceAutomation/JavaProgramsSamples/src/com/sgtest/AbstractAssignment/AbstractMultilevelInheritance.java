package com.sgtest.AbstractAssignment;
abstract class Airbus{
	abstract void plane(int speed);
	void aero(String a)
	{
		System.out.println("type of the plane: "+a);
	}
}
class Jet extends Airbus{
	void plane(int speed) {
		System.out.println("speed of the plane: "+speed);
	}
}
class Chopper extends Jet{
	void plane(int a)
	{
		super.plane(a);
	}
}
public class AbstractMultilevelInheritance {
	public static void main(String[] args) {
		Chopper chp=new Chopper();
		chp.plane(2500);
		chp.aero("Fighter");

	}

}
