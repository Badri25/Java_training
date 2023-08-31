package main.Days.Day3.Question1;

public class Question1 {
 public void  start() {
	 try {
		 throw new Exception("This is an exception");
	 }catch(Exception e){
		 System.out.println("Caught exception is:"+ e.getMessage());
	 }finally {
		 System.out.println("The block is fully executed");
	 }
 }
}
