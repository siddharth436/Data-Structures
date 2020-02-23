package geeksforgeeks;

import java.util.Scanner;

public class setbitsrange {
	public static void main(String[] args) {
		
	System.out.println("Enter the range");
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	int count = 0;
	int j=0;
	int i =0;

		while(j<=n) {
			i=j;
			while(i>=1) {
				int m = i%2;
				i=i/2;
			if(m==1)
					count++;
			}j++;
		}
	
	System.out.println("set bits are "+count);
	
}
}




//			k =Integer.toBinaryString(i);
//			int result=Integer.parseInt(k);
//			System.out.println(result);
//			if
			
			

