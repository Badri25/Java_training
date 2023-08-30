package main.Days.Day2;

import java.io.IOException;

import main.Days.Day2.Question1.Question1;
import main.Days.Day2.Question10.Question10a;
import main.Days.Day2.Question10.Question10b;
import main.Days.Day2.Question2.Question2;
import main.Days.Day2.Question3.Question3;
import main.Days.Day2.Question4.Question4;
import main.Days.Day2.Question5.Question5;
import main.Days.Day2.Question6.Question6;
import main.Days.Day2.Question7.Question7;
import main.Days.Day2.Question9.Question9;

public class Day2 {
	int ques;
	public Day2(int q) {
		this.ques=q;
	}
	
	public void start() {
		switch(ques) {
		case 1:
			Question1 ques1 = new Question1();
			ques1.input1();
			break;
		case 2:
			Question2 ques2 = new Question2();
			break;
		case 3:
			Question3 ques3 = new Question3();
			break;
		case 4:
		     Question4 ques4 = new Question4();
		     break;
		case 5:
			Question5 ques5 = new Question5();
			break;
		case 6:
			Question6 ques6 = new Question6();
			break;
		case 7:
			Question7 ques7 = new Question7();
			break;
		case 8:
		  //  Question1 ques8 = new Question8();
		 //   break;
		case 9:
	    	Question9 ques9 = new Question9();
	    	break;
		case 10:
			Question10a ques10a = new Question10a();
			break;
		case 11:
			Question10b ques10b = new Question10b();
			break;
		default:
			System.out.println("Invalid");
		}
	}
}
