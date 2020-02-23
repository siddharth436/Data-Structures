package dataStructures;

class Divisors{
	public int exactly3Divisors(int N){
	int count = 0;
	int divisor=0;
	for(int i=1;i<=N;i++){
		for(int j=1;j<=N;j++){
		    if(i%j==0){
		    	count++;
		        if(count==3)
		        	divisor=i;
		    }
		    count=0;
		}
	}
	return divisor;
	}
}
		
		  
	        