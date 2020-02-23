package dataStructures;


	class Primality 
	{
	    
	    public boolean isPrime(int N)
	    {
	        boolean b = false;
	        int count = 0;
	        for(int i=1;i<=N;i++){
	            if(N%i==0) {
	                		count++;
	                		if(count==2)
	                			b=true;
	                		else 
	                			b= false;
	        }
	            else
	            	b= false;
	        
	        
	      //Your code here
	    }
			return b;
	}
	}
	    



