package Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ColourList {

	public static void main(String[] args) {
		 ArrayList<String> colors = new ArrayList<String>();
		 
		 colors.add("Red");
		 colors.add("Blue");
		 colors.add("Green");
		 colors.add("Yellow");
		 
		 System.out.println("Arraylist: " + colors);
		 
		 //Task1:How do you retrieve the element at index 2 from an ArrayList in Java?
		 
		 System.out.println("Element at index 2: " +colors.get(2));
		 
		 //Task2:Write a Java program to insert "Purple" at the second position in an ArrayList of colors.
		 
		 colors.add(1,"Purple");
		 System.out.println("Arraylist: " +colors);
		 
		 //Task3:How do you remove an element "Green" from an ArrayList?
		 
		 colors.remove("Green");
		 System.out.println("After removing green colors:" +colors);
		 
		 //Task4:print whole ArrayList
		 
		 System.out.println("Whole arraylist is: " +colors);
		 
		 //Task5:sort an ArrayList of colors in alphabetical order.
		 
		 Collections.sort(colors);
		 System.out.println("Sorted list: " +colors);
		 
		 //Task6: reverse an ArrayList
		 
		 Collections.reverse(colors);
		 System.out.println("Reversed list: " +colors);
		 
		 //Task7:Iterate through an ArrayList using a for-each loop
		 
		 for (String color : colors) {
			 System.out.println(color);
		 }
		 
		 

	}

}
