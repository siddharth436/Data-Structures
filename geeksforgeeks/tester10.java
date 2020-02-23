package geeksforgeeks;

class tester10 {
	static int count=0;
	 static void isPrime (int n) 
	 {
		
	     if(n==1)
			System.out.println("No");
		else if(n==2)
			System.out.println("Yes");
		else {
			for (int i = 1 ; i <=n ; i++) {
				if(n%i==0) {
//					System.out.println(i);
					count++;
				}
			
			
		}
		
			
			if(count>2)
				System.out.println("No");
			else
				System.out.println("Yes");
	
}
}
}
           
