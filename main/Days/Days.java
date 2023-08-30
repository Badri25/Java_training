package main.Days;
import java.io.IOException;
import java.util.*;

import main.Days.Day1.Day1;
import main.Days.Day2.Day2;
public class Days {
	private int days;
   public Days(int d) {
		this.days=d;
	}

public void start()  {
	System.out.println("Which ques you want");
	Scanner sc = new Scanner(System.in);
	int ques = sc.nextInt();
		switch(days){
		case 1:
			Day1 day1 = new Day1(ques);
			day1.start();
			break;
		case 2:
			Day2 day2 = new Day2(ques);
			day2.start();
			break;
	
		default:
			System.out.println("Error");
		}
	}
}
