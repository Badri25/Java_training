package main.Days.Day2.Question2;

import main.Days.Day2.Question2childclass.Question2childclass;
import main.Days.Day2.Question2interface.Question2interface;
import main.Days.Day2.Question2parentclass.Question2parentclass;

	public class Question2{
		public Question2(){
		Question2interface obj1 = new Question2parentclass();
		Question2childclass obj2 = new Question2childclass();
		obj1.pmethod();
		obj2.cmethod();
		obj2.pmethod();
		}
	}

