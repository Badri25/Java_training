package main;
import java.io.IOException;
import java.util.*;

import main.Days.Days;
public class executableclass {
  public void start()  {
	   Scanner sc = new Scanner(System.in);
	   int d;
	   System.out.print("choose the day u want:");
	   d=sc.nextInt();
	   Days yay = new Days(d);
	   yay.start();
   }
}
