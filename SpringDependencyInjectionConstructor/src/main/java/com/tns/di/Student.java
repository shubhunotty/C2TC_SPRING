package com.tns.di;

public class Student {
	
	private String studentname;
	private int id;
	
	public Student(String studentname, int id) {
		super();
		this.studentname = studentname;
		this.id = id;
	}




	void display() {
		System.out.println("Student name is : "+ studentname + " and id is : " + id);
	}
	
	

}
