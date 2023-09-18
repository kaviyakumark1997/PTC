package com.java_concepts;               

public class Array_concepts {      
	int a;   //this is a class variable(declared inside a class)
	private void myMethod() {    // method creation (syntax= private void methodName())
		int b=150; // this is a local variable (declared inside a method)
		System.out.println(a);
		System.out.println(b);
		
	}

	public static void main(String[] args) {
		Array_concepts c= new Array_concepts(); // object creation
		c.myMethod();  // to call a method
		System.out.println(c.a); // only class variable can be called outside a method, not local variable
		

	}

}
