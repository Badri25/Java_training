package main.Days.Day3.Question2;

public class Question2 {
	public void method() {
		System.out.print("hello");
	}
	public void start() {
  Question2 ques2 = null;
  try {
   ques2.method();
  }catch(Exception e) {
	  System.out.println("Exception:"+ e.getMessage());
  }
   
	}
  
}
