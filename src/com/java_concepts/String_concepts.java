package com.java_concepts;

public class String_concepts {

	public static void main(String[] args) {
		String s="kaviya"; // immutable strings
		String s1="ammu";
		String s2="latha";
		System.out.println(s);
		System.out.println(s);
		System.out.println(System.identityHashCode(s));
		s=s2+s1;
		System.out.println(s);
		System.out.println(System.identityHashCode(s));

	}

}

// mutable string concepts


//package com.java_concepts;

//public class String_concepts {

	//public static void main(String[] args) {
                //StringBuffer sb= new StringBuffer("kaviya");
                //StringBuffer sb2= new StringBuffer("kavs");
                //System.out.println(System.identityHashCode(s));
                //sb=sb.append(sb2);
                //System.out.println(sb);
                ////System.out.println(System.identityHashCode(sb));


//}

