package main.Days.Day3;

import main.Days.Day3.Question1.Question1;
import main.Days.Day3.Question2.Question2;
import main.Days.Day3.Question3.Question3;
import main.Days.Day3.Question4.Question4;
import main.Days.Day3.Question5.Question5;

public class Day3 {
	int ques;
	public Day3(int q) {
		this.ques=q;
	}
	
	public void start() {
		switch(ques) {
		case 1:
			Question1 ques1 = new Question1();
			ques1.start();
			break;
		case 2:
			Question2 ques2 = new Question2();
			ques2.start();
			break;
		case 3:
			Question3 ques3 = new Question3();
			ques3.start();
			break;
		case 4:
			String s="";
		     Question4 ques4 = new Question4(s);
		     ques4.start();
		     break;
		case 5:
			Question5 ques5 = new Question5();
			ques5.start();
			break;
		}
		}
}
