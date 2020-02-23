package geeksforgeeks;

import java.util.Scanner;

public class factors {
	
	
	public static void main(String[] args) {
		int count = 0;
		int n;
		Scanner in = new Scanner(System.in);
		n= in.nextInt();
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

