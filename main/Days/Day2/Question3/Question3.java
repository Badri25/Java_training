package main.Days.Day2.Question3;


import main.Days.Day2.Question3child1.Question3child1;
import main.Days.Day2.Question3child2.Question3child2;

public class Question3 { 
	public Question3(){
		Question3child1 obj1 = new Question3child1();
		obj1.name = "Rohan";
		obj1.age = 22;
		obj1.phoneNumber = "123456789";
		obj1.address = "fbd";
		obj1.salary = 5000000;
		obj1.specialization = "Sde";
	    
		Question3child2 obj2 = new Question3child2();
		obj2.name = "Saksham";
		obj2.age = 22;
		obj2.phoneNumber = "123456789";
		obj2.address = "fbd";
		obj2.salary = 5000000;
		obj2.department = "DL";
	    
		
		 System.out.println("Employee Details:");
	     System.out.println("Name: " +  obj1.name);
	     System.out.println("Age: " +  obj1.age);
	     System.out.println("Phone Number: " +  obj1.phoneNumber);
	     System.out.println("Address: " +  obj1.address);
	     System.out.println("Salary: " +  obj1.salary);
	     System.out.println("Specialization: " +  obj1.specialization);
	     obj1.printsal();

	        System.out.println();

	        // Printing manager details
	        System.out.println("Manager Details:");
	        System.out.println("Name: " + obj2.name);
	        System.out.println("Age: " + obj2.age);
	        System.out.println("Phone Number: " + obj2.phoneNumber);
	        System.out.println("Address: " + obj2.address);
	        System.out.println("Salary: " + obj2.salary);
	        System.out.println("Department: " + obj2.department);
	        obj2.printsal();
	}

}
