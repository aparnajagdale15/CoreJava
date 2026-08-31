package Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListInteger {

	public static void main(String[] args) {
		ArrayList<Integer> numbers=new ArrayList<>();
		
		numbers.add(89);
		numbers.add(78);
		numbers.add(56);
		numbers.add(45);
		numbers.add(199);
		
		System.out.println("ArrayList: " +numbers);
		
		//Task 1:How do you retrieve the element at index 4 from an ArrayList in Java?
		
		System.out.println("Element at index 4 is: " +numbers.get(4));

		//Task 2:Write a Java program to insert 200 at the third position in an ArrayList of colors.
		
		numbers.add(2,200);
		System.out.println("ArrayList: " +numbers);
		
		//Task 3:How do you remove an element 78 from an ArrayList?
		
		numbers.remove(Integer.valueOf(78));
		System.out.println("After removing 78 from arraylis: " +numbers);
		
		//Task 4: Iterate through an ArrayList using a for-each loop
		
		for(int number : numbers) {
			System.out.println(number);
		}
			
		//Task 5:print whole ArrayList
			
			System.out.println(numbers);
			
		//Task 6:Task 6:sort an ArrayList in alphabetical order.
			
			   Collections.sort(numbers);

		        System.out.println("SortedList:" +numbers);
		        
		 //Task 7: Reverse an ArrayList
		        
		        Collections.reverse(numbers);
		        System.out.println("Reversed list: " +numbers);
	
		}
	}


