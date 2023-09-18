package com.java_concepts;

public class Exception_Concept {
	
	public static void main(String[] args) {
		
		String s="12345";
		
		//String to Integer
		Integer value = Integer.valueOf(s);
		
		System.out.println(value);
		
		//Integer to String
		String value1 = String.valueOf(value);
		
		System.out.println(value1);
		
		//String to int
		int parseInt = Integer.parseInt(s);
		System.out.println(parseInt);
		
	}
	

}
