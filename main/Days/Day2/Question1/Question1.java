package main.Days.Day2.Question1;

import java.util.Scanner;

import main.Days.Day2.Question1classes.circle;
import main.Days.Day2.Question1classes.hexagon;
import main.Days.Day2.Question1classes.square;

public class Question1 {
	public void input1() {
	int q;
    Scanner sc = new Scanner(System.in);
    System.out.println("Choose your shape");
    q=sc.nextInt();
    switch(q) {
    case 1:
    	square sq = new square();
    	sq.draw();
    	break;
    case 2:
    	hexagon hg = new hexagon();
    	hg.draw();
    	break;
    case 3:
    	circle cg = new circle();
    	cg.draw();
    	break;
    default:
    	System.out.println("invalid");
    	
    }
	}
    
}
