package geeksforgeeks;


	class Geeks{
	    
	    static int coutChars(String s1, String s2)
	    {
	        int count1 = s1.length();
	        int count2 = s2.length();
	        int extra=0;
	        if(count1>count2){
	            extra = (count1-count2);
	            
	        }
	        else if(count2>count1){
	            extra = (count2-count1);
	           
	        }
	        else if(count1==count2)
	            extra=0;
	       
	        return extra;//Your code here
	    }
	}

	
