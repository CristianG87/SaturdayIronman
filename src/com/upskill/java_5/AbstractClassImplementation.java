package com.upskill.java_5;

public class AbstractClassImplementation extends AbstractClass {

	@Override
	public void iDoor() {
		System.out.println("My car has 4 doors");
		
	}

	@Override
	public String iEngine() {
		System.out.println("My car has duel motor engine");
		return "Dual Motor";
	}

	@Override
	public void iColor() {
		System.out.println("My car is Red");	
		
	}

	@Override
	public int iWheel() {
		System.out.println("My car has 4 Wheels");
		return 4;
	}

}
