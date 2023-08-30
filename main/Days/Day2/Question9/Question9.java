package main.Days.Day2.Question9;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Question9 {
	public Question9(){
	 Date currentDate = new Date();

     
     SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
     String formattedDateTime = dateFormat.format(currentDate);

     // Print the formatted current date and time
     System.out.println(formattedDateTime);
	}
}
