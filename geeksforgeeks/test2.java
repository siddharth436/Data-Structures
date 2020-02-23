package geeksforgeeks;


import java.util.Scanner;

public class test2{
    
    // Function to print ForkJava
    // N : input number
	
	    
	    // Function to print ForkJava
	    // N : input number
	public static void main(String args[]) {	
	int N;
		Scanner scn = new Scanner(System.in);
		N=scn.nextInt();
	    
		if(N%3==0)
			if(N%5==0)
				if(N%15==0)
					System.out.println("Fork Java");
				else 
					System.out.println("Java");
			else
				System.out.println("Fork");
		else if(N%5==0)
				if(N%15==0)
					System.out.println("Fork Java");
				else
					System.out.println("Java");
		else
			System.out.println();
				
	       
	        // Your code here
	        
	        
	    
	    
	
}
}