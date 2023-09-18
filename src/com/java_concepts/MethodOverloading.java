package com.java_concepts;

public class MethodOverloading {
	
	private void student(String name, int age) {
		System.out.println("Student Name and age are:"+name+","+age);
	}
	
	private void student(int age, String name) {
		System.out.println("Student Name:"+name);
	}
	
	private void student(int mark) {
		System.out.println("Student mark:"+mark);
	}
	
	public static void main(String[] args) {
		MethodOverloading st=new MethodOverloading();
		st.student(450);
		st.student("Bala", 300);
		
	}
}
