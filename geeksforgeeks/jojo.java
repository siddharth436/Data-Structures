package geeksforgeeks;

import java.util.Scanner;

public class jojo {
	 static void printTable () 
	 {		
		 Scanner in = new Scanner(System.in);
		 	int n= in.nextInt();
		 	
           int multiplier=10;
           int k=0;
           while(multiplier>0)
           {
               n*=multiplier;
               //Your code here
           }
      System.out.println(n);
      multiplier--;
	 }
}


