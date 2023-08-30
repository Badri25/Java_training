package main.Days.Day2.Question10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Question10b  {
	public Question10b() throws IOException{
		
	
	BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\badrinath.galla\\OneDrive - Sapiens\\Desktop\\Task\\Poem.txt"));
	String data="";
	while((data=br.readLine())!=null) {
		System.out.println(data);
	}
	
	
	BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\badrinath.galla\\OneDrive - Sapiens\\Desktop\\Task\\Poem.txt"));
    bw.write("\n This is another line");
    bw.close();
	}
}
