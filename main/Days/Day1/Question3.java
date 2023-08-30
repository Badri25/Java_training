package main.Days.Day1;

import java.util.Scanner;

import DAY1.Q3;

public class Question3 {
	private char [] letters;
	public Question3(){
		Scanner s = new Scanner(System.in);
		char miss = '*';
		char [] letters = s.next().toCharArray();
		for(int i=1;i<letters.length;i++) {
			if(letters[i]-letters[i-1]>1) {
				miss=(char)(letters[i-1]+1);
				break;
			}
		}
		if(miss=='*') {
			System.out.println("None missin");
		}else {
			System.out.println(miss);
		}
	}
}
