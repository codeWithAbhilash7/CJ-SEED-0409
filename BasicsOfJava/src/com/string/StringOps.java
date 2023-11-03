package com.string;

public class StringOps {
	public static void main(String[] args) {
		// String constant pool (scp)
		String s1 = "India";
		String s2 = "India";

		s1 = "Pune";

		System.out.println(s1);
		System.out.println(s2);

		String s3 = new String("India");
		String s4 = new String("India");

		if (s3 == s4) {
			System.out.println("Strings are equal");
		} else {
			System.out.println("Strings are NOT equal");
		}

		if (s1.equals(s2)) {
			System.out.println("Strings are equal");
		} else {
			System.out.println("Strings are NOT equal");
		}

		// string intern
		String s5 = new String("India").intern();
		if (s1 == s5) {
			System.out.println("Strings are equal");
		} else {
			System.out.println("Strings are NOT equal");
		}
	}
}
