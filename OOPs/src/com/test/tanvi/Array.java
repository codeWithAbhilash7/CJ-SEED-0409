package com.test.tanvi;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr =  {6,8,1,4,15};
		int temp = 0;
		
		for (int i=0; i < 5; i++) {
			for(int j=i+1; j<5; j++) {
				if(arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println();
		
		System.out.println("Array in Descending Order :");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}

}
