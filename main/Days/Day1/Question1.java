package main.Days.Day1;

import java.util.Scanner;

public class Question1 {
	private int [] arr;
	private boolean g;
	
	public Question1(){
		start();
	}
	
	public void start() {
		int n;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		int [] arr = new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
		     g=check(arr[i]);
			if(g) {
				System.out.println("Bingo!");
				break;
			}
		}
		if(!g)System.out.println("There is no 9 in the array");
	}
	
	public boolean check(int n) {
		if(n<10){
			return n==9;
		}
		if(n%10==9){
			return true;
		}else {
			return  check(n/10);
		}
	}
   
}
