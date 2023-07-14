package com.cg.dayfour;

public class Encapsule {
	private String name;
	private int age;
	private String gender;

	public String getName() {
		return name;
	}

	public void setName() {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}


	

	@Override
	public String toString() {
		return "Encapsule [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

}
