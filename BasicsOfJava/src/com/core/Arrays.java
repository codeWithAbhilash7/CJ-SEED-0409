package com.core;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// array of 10 integers
		int arr[] = new int[10];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; ++i) {
			System.out.print("Enter " + (i + 1) + " element :");
			arr[i] = sc.nextInt();
			System.out.print(arr[i] + " ");
		}

		for (int i = 0; i < arr.length; ++i) {
			System.out.print(arr[i] + " ");
		}

		// collection of similar data type
		// memory allocation is contiguous

		int arr2[][] = new int[3][4];
		arr2[0][0] = 1;
		arr2[0][1] = 2;
		arr2[0][2] = 3;
		arr2[0][3] = 4;

		arr2[1][0] = 5;
		arr2[1][1] = 6;
		arr2[1][2] = 7;
		arr2[1][3] = 8;

		arr2[2][0] = 9;
		arr2[2][1] = 10;
		arr2[2][2] = 11;
		arr2[2][3] = 12;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.print("\n");
		}

		for (int[] is : arr2) {
			for (int i : is) {
				System.out.print(i + " ");
			}
			System.out.print("\n");

		}

		// create a new array of size 4
		// copy all contents of old array to new array
	}

}
