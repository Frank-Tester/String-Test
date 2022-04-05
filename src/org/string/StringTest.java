package org.string;

public class StringTest {

	public static void main(String[] args) {

		String a = "Nisha";
		String b = "Nisha";

		String c = "Welcome To Java class @123";
		String c1 = "Welcome";
		int upper = 0, lower = 0, number = 0, schar = 0;

		String a1 = new String("Java");
		String b1 = new String("Java");

		
		System.out.println(a);
		String replace = a.replace("N", "#");
		System.out.println(replace);

		int length = b.length();
		System.out.println(length);

		String l = a.toUpperCase();
		System.out.println(l);

		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));

		System.out.println(System.identityHashCode(a1));
		System.out.println(System.identityHashCode(b1));

		String substring = c.substring(0, 7);
		System.out.println(substring);
		int len = c.length();
		int len1 = c1.length();

		for (int i = 0; i < len; i++) {
			char ch = c.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				upper++;

			} else if (ch >= 'a' && ch <= 'z') {
				lower++;
			} else if (ch >= '0' && ch <= '9') {
				number++;
			} else {
				schar++;
			}

		}

		System.out.println("\nnumber of Upper case : " + upper);
		System.out.println("\nnumber of Lower case : " + lower);
		System.out.println("\nnumber of numbers : " + number);
		System.out.println("\nnumber of special Char : " + schar);

	}
}
