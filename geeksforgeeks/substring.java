package geeksforgeeks;


import java.util.*;
import java.lang.*;
import java.io.*;

class substring {
	public static void main (String[] args) throws NumberFormatException,IOException{
		int T;
		int i,j ;
		int k=0;
		String m = new String();
		Scanner sc = new Scanner(System.in); 
		 T=sc.nextInt(); 
//			
//		    InputStreamReader isr = new InputStreamReader(System.in);
//		    BufferedReader bfr = new BufferedReader(isr);
//		    T= Integer.parseInt(bfr.readLine());
		
		    
			while(k < T){
				sc.next();
		    	m = sc.nextLine();
		    	i=sc.nextInt();
		    	
		    	j=sc.nextInt();
		    	
		    	System.out.println(m.substring(i,j));
		    	k++;
		    	sc.next();

		    }
		    	
		    
		    
		    
		//code
	
}
}

