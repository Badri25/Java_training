package main.Days.Day2.Question5;

public class Question5 {
	public Question5(){
	 String s = "Quote: The Quick brown fox jumps over a lazy dog";

     String[] div = s.split(":");
     
     for (String splits : div) {
         System.out.println(splits);
     }
	}
}
