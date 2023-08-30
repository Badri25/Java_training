package main.Days.Day2.Question10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Question10a {
	public Question10a(){
	 try {
			FileWriter writer = new FileWriter("poem.txt");
			writer.write("the quick brown fox ");
			writer.append("jumps over the lazy dog");
			writer.close();
   }catch(IOException e) {
 	  e.printStackTrace();
   }
   
   try {
 	  FileReader reader = new FileReader("poem.txt");
 	  int data = reader.read();
 	  while(data!=-1) {
 		  System.out.print((char)data);
 		  data=reader.read();
 	  }
 	  reader.close();
   }catch(FileNotFoundException e) {
 	  e.printStackTrace();
   }catch(IOException e) {
 	  e.printStackTrace();
   }

	}

	}

