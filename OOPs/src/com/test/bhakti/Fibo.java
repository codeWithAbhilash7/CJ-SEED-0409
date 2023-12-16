package com.test.bhakti;

import java.util.Scanner;

public class Fibo {

	public static void main(String[] args) {
		
		int first, second, next, i, n;
		first = 0;
		second = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		n = sc.nextInt();
		System.out.print(first + " " + second);

		for (i = 2; i <n; ++i) {
			next = first + second;
			System.out.print(" " + next);
			first = second;
			second = next;
		}

	}

}
