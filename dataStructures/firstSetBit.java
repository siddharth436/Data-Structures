package dataStructures;
import java.util.*;
import java.lang.*;
import java.io.*;
class firstSetBit{
	    
	    //Position this line where user code will be pasted.
	    
	public static void main(String[] args) {
		
		int n=4;
	    int res=0;
	   
	    while(n>0){
	        n=(n&(n-1));
	        res++;   	
	        	
	    }
	     System.out.println(res);   
	 
	}
}