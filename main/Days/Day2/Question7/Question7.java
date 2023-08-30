package main.Days.Day2.Question7;

import java.util.Scanner;

public class Question7 {
  public Question7(){
		Scanner sc = new Scanner(System.in);
		 int posCount = 0;
	     int negCount = 0;
	     int oddCount = 0;
	     int evenCount = 0;
	     int zeroCount = 0;

       for (int i = 0; i < 20; i++) {
           int num = sc.nextInt();
           if (num > 0) {
               posCount++;
           } else if (num < 0) {
               negCount++;
           }

           if (num % 2 == 0) {
               evenCount++;
           } else {
               oddCount++;
           }

           if (num == 0) {
               zeroCount++;
           }
       }

       System.out.println(posCount);
       System.out.println(negCount);
       System.out.println(oddCount);
       System.out.println(evenCount);
       System.out.println(zeroCount);
  }
}
