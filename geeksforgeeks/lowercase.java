package geeksforgeeks;
import java.util.*;
import java.lang.*;
import java.io.*;

class lowercase {
	public static void main (String[] args) throws IOException {
		String m = new String();
		int t;
		int k=0;
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		t=Integer.parseInt(bfr.readLine());
		//code
		try {
			while(k<t) {
						m=bfr.readLine();
						String lowerCase [] = new String[t];
						System.out.println(m.toLowerCase());
						k++;
						}
		}catch(IOException ex) {
			ex.printStackTrace();
		}

}
}