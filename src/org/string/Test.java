package org.string;

public class Test {

	public static void main(String[] args) {
		String s1 = "   Geeks For Geeks   ";
		String s = "Computer Program 123";

		String a = s.replace('m', '*');
		System.out.println(a);

		String b = s.replaceAll("Computer", "Java");
		System.out.println("\n"+b);

		String c = s.replaceAll("a", "@");
		System.out.println("\n"+c);

		// Before Trim() method
		System.out.println("\nBefore Trim() - ");
		System.out.println("String - " + s1);
		System.out.println("Length - " + s1.length());

		// applying trim() method on string s1
		s1 = s1.trim();

		// After Trim() method
		System.out.println("\nAfter Trim() - ");
		System.out.println("String - " + s1);
		System.out.println("Length - " + s1.length());
	}

}
