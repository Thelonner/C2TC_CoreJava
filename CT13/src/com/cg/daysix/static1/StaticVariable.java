package com.cg.daysix.static1;

public class StaticVariable {
	private int rollNo;
	private String name;
	static String collegeName ="MSAJCE";
	StaticVariable(int rollNo,String name){
		this.name=name;
		this.rollNo=rollNo;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}
	

}
