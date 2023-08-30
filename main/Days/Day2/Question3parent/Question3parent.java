package main.Days.Day2.Question3parent;

import main.Days.Day2.Question3interface.Question3interface;

public class Question3parent implements Question3interface{
	 public String name;
	public  int age;
	public String phoneNumber;
	public String address;
	public  double salary;
	 
	 public void printsal() {
		 System.out.println(salary);
	 }
}
