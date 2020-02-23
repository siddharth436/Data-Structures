package geeksforgeeks;

import java.util.Scanner;

public class arrcount {
	public static void main(String[] args) {
		int arr[] = {1,1,2,2,3,3,4,4,5,6,6,7,8,9,9,10};
		int flag = 0;
		int flag2 = 0;
		int n = 0;
		Scanner in = new Scanner(System.in);
		n= in.nextInt();
//		for (int i = 0 ; i < arr.length;i++)
			
					
			for (int j = 0; j < arr.length-1;j++)
			{
				if(arr[j]==arr[j+1]) {
					if(n==arr[j]) {
						System.out.println("Repeated ");
						
					}
					else {
						System.out.println("Not Repeated");
						 
					}
				}
				
				
				
			 
				
		}
	}

}
