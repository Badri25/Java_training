package main.Days.Day3.Question3;

public class Question3 {
	public void start() {
	 try {
         int[] numbers = {1, 2};
         int index = 5;  // Index that is out of bounds
         
         int value = numbers[index];  // Accessing an element that doesn't exist
         System.out.println(index + ": " + value);
     } catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
     }
	}
}
