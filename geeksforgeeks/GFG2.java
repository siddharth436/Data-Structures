package geeksforgeeks;

import java.util.Scanner;

class GFG2{
	
		 static void printTable (int n) 
		 {
			 	Scanner in = new Scanner(System.in);
			 	
	            int multiplier=10;
	            int n1=in.nextInt();
	            while(multiplier>0)
	            {
	                System.out.println(n1*multiplier);
	                multiplier--;
	                //Your code here
	            }
	      
	       
		 }
	}