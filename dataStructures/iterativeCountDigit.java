package dataStructures;

import java.util.Scanner;

public class iterativeCountDigit {
	
	public int count(long n) {
		int count=0;
		while(n!=0) {
			n=n/10;
			count++;
		
		}
			
		return count;
		
	}
	
	public static void main(String[] args) {
		long n;
		iterativeCountDigit icd = new iterativeCountDigit();
		Scanner in = new Scanner(System.in);
		n=in.nextLong();
		System.out.println(icd.count(n));				
	}

}
