// program on class and object
package com.tns.programs;

public class Oppsconcept {
	int yearofpurchase;      // data member or properties
	String make;
	int model;
	double cost;
	public void display1()    // member function
	{
		System.out.println("year of purchase"+ 2001);
		System.out.println("make"+ "Suzuki");
		
		
	}
	void disp2()
	{
		System.out.println("model"+ 1999);
		System.out.println("cost"+ 500000);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Oppsconcept ob1=new Oppsconcept(); // object creation
		ob1.display1();
		ob1.disp2();

	}

}
