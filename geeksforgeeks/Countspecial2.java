package geeksforgeeks;

public class Countspecial2 {
	public static void main(String[] args) {
		
	
	
		int n = 5;
		int k = 2;
		int a[]= {1,4,1,4,4,1};
		int []b= new int[2*(a.length)];
        int f = (int)Math.floor(n/k);
        int count = 0;
        for (int i = 0 ; i < a.length; i++){
            for(int j = 0; j < a.length;j++) {
                if(a[j]==a[i]) {
                	count++;
                	System.out.println(count);
                	
                	if(count==f) {
                		  b[i]=a[i];
                		
                		
                	} break;
                	
                	
                		
                
           
        }
            
            
            for(int c = 0 ; c< b.length;c++)
            	System.out.println(b[c]);
           
	}
       
        
        
}
	}
}

        
        
            
            
                	
//        }
//        System.out.println(count);
//            
//        // your code here
//        
//    }
//}


