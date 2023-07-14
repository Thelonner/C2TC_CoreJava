package com.cg.daysix.static1;

public class StaticMethod {
	private int no;
	private static int regno;
	static {
		System.out.println("Static block");
		regno =5597;
		//mno =5; becuse non static variabble cannot be accessed
	}
	StaticMethod(){
		System.out.println("Default constructor");
		no++;
		regno++;
	}
	
	@Override
	public String toString() {
		return "StaticMethod [no=" + no + ", rollno =" + regno + "]";
	}

	static void display() {
		//System.out.println(regno);
		//System.out.println();
	}

}
