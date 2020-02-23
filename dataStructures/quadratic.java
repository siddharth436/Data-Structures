package dataStructures;

public class quadratic {
	class Quadratic 
	{
	    public void quadraticRoots(int a,int b,int c)
	    {
	    	
	    	float e = (float) Math.sqrt(b*b-(4*a*c));
	        float d = (float) ((-b+e)/(2.0*a));
	        int v = (int) Math.floor(d);
	    }
	}


}
