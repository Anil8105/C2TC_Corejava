package com.tns.progms;
class withdraw//base class
{
	int withdraw=20000;
}

public class Inheritence extends withdraw {//child class

	public static void main(String[] args) {
		
		Inheritence obj=new Inheritence();
		System.out.println("the withdrawal ammount is"+obj.withdraw);
		

	}

}
