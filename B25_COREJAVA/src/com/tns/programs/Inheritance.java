package com.tns.programs;
class withdraw                                // base class
{
	int amt_withdraw=2000;
}
public class Inheritance extends withdraw {   // child class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Inheritance ob1 = new Inheritance();  // always create an object
		System.out.println("amountwithdraw"+ ob1.amt_withdraw);

	}

}
