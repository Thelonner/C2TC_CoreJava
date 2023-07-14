package com.cg.daysix.final1;

public class Finalvariable {
	//final variable shouuld be initialized 
	final int a=12;
	final static int b;
	void change() {
		//a=10;// fial var cannnot be assigned
		//b=12;
	}
	Finalvariable(){
		final int a;
		//b=33;
		a=23;
	}
	static {
		//final variable cannot be reasssigned in sttaic block
		b=55;//final static cn be reassigned in sttaic block
		
	}
		
	
}
