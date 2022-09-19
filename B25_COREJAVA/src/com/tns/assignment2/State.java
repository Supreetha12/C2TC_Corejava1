package com.tns.assignment2;

public class State {
	public void methodState()
	   {
	     System.out.println("state method");
	   }
	}
	class city extends State
	{
	public void methodcity()
	{
	System.out.println("city method");
	}
	}
	class district extends city
	{
	   public void methoddistrict()
	   {
	     System.out.println(" district method");
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		district obj = new district();
	     obj.methodState();
	     obj.methodcity(); 
	     obj.methoddistrict();

	}

}