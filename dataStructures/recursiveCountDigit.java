package dataStructures;

import java.util.Scanner;

public class recursiveCountDigit {
	public int countDigit(long n) {
		if(n==0)
			return 0;
		else
			return 1+countDigit(n/10);
	}
	public static void main(String[] args) {
		recursiveCountDigit rcd = new recursiveCountDigit();
		long n;
		Scanner in = new Scanner(System.in);
		n=in.nextLong();
		System.out.println(rcd.countDigit(n));
	}

}
