package main.Days.Day1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import DAY1.Q2;

public class Question2 {
	private String [] s;
	public Question2(){
		int n;
		Scanner sci = new Scanner(System.in);
		n=sci.nextInt();
		sci.nextLine();
		String [] s = new String[n];
		for(int i=0;i<n;i++) {
			s[i]=sci.nextLine();
		}
		Arrays.sort(s,Comparator.comparing(a->a.length()));
		
		for(int i=0;i<n;i++) {
			System.out.println(s[i]);
		}
	}
}
