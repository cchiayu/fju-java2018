package com.tom;

public class Student {
	String name;
	int english;
	int math;
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(name + "\t" + english + "\t" + math +"\t" +(english+math)/2 );
	}

	public Student(String name, int english , int math){
		
		this.name = name;
		this.math = math;
		this.english = english;
			
	}
	public Student() {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.math = math;
		this.english = english;
	}
	
}
