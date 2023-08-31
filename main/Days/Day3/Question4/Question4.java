package main.Days.Day3.Question4;

public class Question4 extends Exception{
	public String str;
	public Question4(String s){
		this.str=s;
		
	}
	 public void displayCustomMessage() {
	        System.out.println("Custom Exception Message: " + str);
	    }
	public void start() {
		try {
            throw new Question4("This is a custom exception message.");
        } catch (Question4 e) {
            System.out.println("Caught CustomException.");
            e.displayCustomMessage();
        }
	}
}
