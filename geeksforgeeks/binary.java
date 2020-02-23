package geeksforgeeks;

public class binary {
	public static void main(String[] args) {
		
//		String k=Integer.toBinaryString(n);
//		System.out.println(k);
		
		int n=13;
		int counter1=0;
		
		
		
			while(n>=1) {
				int m = n%2;
				n=n/2;
				
				System.out.println(m);
				if(m==1)
					counter1++;
		}
		
		
			
		
				
		
		System.out.println("set bits are "+counter1);
		
		
			
	}

}
