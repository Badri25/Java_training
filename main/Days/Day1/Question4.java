package main.Days.Day1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import DAY1.Q4;

public class Question4 {
	private String ans;
	private String g;
	public Question4(String ans, String g) {
	        this.ans = ans;
	        this.g = g;
	        input4(ans, g);
	    }
	
	public void input4(String ans,String gg) {
		Scanner stu = new Scanner(System.in);
		//an = stu.nextLine();
		//gg=stu.nextLine();
		 Map<Character,Integer> mp = new HashMap<>();
		  for (char c : ans.toCharArray()) {
	            mp.put(c, mp.getOrDefault(c, 0) + 1);
	        }
		  
		  for(char c:gg.toCharArray()) {
			  if (mp.containsKey(c)) {
	                mp.put(c, mp.get(c) - 1);
	                if (mp.get(c) == 0) {
	                    mp.remove(c);
	                }
	            } else {
	                System.out.println("False");
	                return;
	            }
		  }
		  System.out.println("True");
	}
}
