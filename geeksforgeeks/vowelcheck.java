package geeksforgeeks;
class vowelCheck{
	public static void main(String[] args) {
		
	
    
		
			int v=0;
			int c=0;
			String s="aaaaaa";
        
			char d[] = s.toCharArray();
			for(char e: d) {
				if(e =='a' || e=='e' || e =='i' || e=='o' || e=='u') {
					c++;
        	
				}		
				else
					v++;
        }
	
        
        //Your code here
        System.out.println(c);
        System.out.println(v);
        
        if(v>c)
        	System.out.print("Yes");
        else if(c>v)
        	System.out.print("No");
        else
        	System.out.print("Same");
        
        System.out.println();
    }
}

