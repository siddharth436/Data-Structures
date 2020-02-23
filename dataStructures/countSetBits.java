package dataStructures;

import java.util.Scanner;

public class countSetBits {
	public static void main(String[] args) {
		int n;
		int res=0;
		Scanner in = new Scanner(System.in);
		n=in.nextInt();
		while(n>0) {
			n=(n & (n-1));
			res++;
		}
		System.out.println(res);
		if(res==1) {
			System.out.println("n is power of 2");
		}
		else
			System.out.println("n not power of 2");
	}

}
