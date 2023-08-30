package main.Days.Day1;

public class Day1 {
	int ques;
	public Day1(int q) {
		this.ques=q;
		
	}
	
	public void start() {
		switch(ques) {
		case 1:
			Question1 ques1 = new Question1();
		case 2:
			Question2 ques2 = new Question2();
		case 3:
			Question3 ques3 = new Question3();
			
		case 4:
			Question4 ques4 = new Question4("heterogenous","htrz");
		default:
			System.out.println("Invalid");
		}
	}
}
