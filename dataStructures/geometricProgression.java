package dataStructures;

public class geometricProgression {
	
	class GP 
	{
	    
	    public double termOfGP(int A,int B,int N)
	    {
	        double r=B/A;
	        double gp = 0;
	        for(int i=1;i<=N;i++){
	            gp= A*r;
	        }
			return gp;
	            //Your code here
	    }


	}
}
