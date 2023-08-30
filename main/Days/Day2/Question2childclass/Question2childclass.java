package main.Days.Day2.Question2childclass;

import main.Days.Day2.Question2interface.Question2interface;
import main.Days.Day2.Question2parentclass.Question2parentclass;

public class Question2childclass extends Question2parentclass implements Question2interface{
	public void pmethod() {
		System.out.println("This is parent class(overriden)");}
	
	 public void cmethod() {
		System.out.println("This is child class");
	}
}
