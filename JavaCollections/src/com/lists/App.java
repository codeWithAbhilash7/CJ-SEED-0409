package com.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = new ArrayList<Integer>();

		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		numbers.add(60);
		numbers.add(70);
		numbers.add(80);
		numbers.add(90);
		numbers.add(100);
		
		//numbers.set(0, 11);

	//	System.out.println(numbers);

//		for (int i = 0; i < numbers.size(); i++) {
//			System.out.println("removing element :: " + numbers.get(i));
//			numbers.remove(i);
//		}

//		for (Integer item : numbers) {
//			numbers.remove(item);
//		}

//		for (Iterator iterator = numbers.iterator(); iterator.hasNext();) {
//			System.out.println("removing element :: " + iterator.next());
//			 iterator.remove();
//		}
		
		
		Iterator iterator = numbers.iterator();
		while (iterator.hasNext()) {
			System.out.print (iterator.next() + " ");
		}

		//System.out.println(numbers);

	}

}
