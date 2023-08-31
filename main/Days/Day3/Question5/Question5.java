package main.Days.Day3.Question5;
class CustomException1 extends Exception {
    public CustomException1(String message) {
        super(message);
    }
}

class CustomException2 extends Exception {
    public CustomException2(String message) {
        super(message);
    }
}

class CustomException3 extends Exception {
    public CustomException3(String message) {
        super(message);
    }
}

public class Question5 {
	 public void throwAllExceptions(int type) throws CustomException1, CustomException2, CustomException3 {
	        if (type == 1) {
	            throw new CustomException1("Custom Exception 1 occurred.");
	        } else if (type == 2) {
	            throw new CustomException2("Custom Exception 2 occurred.");
	        } else if (type == 3) {
	            throw new CustomException3("Custom Exception 3 occurred.");
	        }
	 }
	 


public void start() {
	 Question5 thrower = new Question5();

     try {
         thrower.throwAllExceptions(2);  // Change the argument to throw different exceptions
     } catch (CustomException1 | CustomException2 | CustomException3 e) {
         System.out.println("Caught exception: " + e.getMessage());
     }
}
	 }



