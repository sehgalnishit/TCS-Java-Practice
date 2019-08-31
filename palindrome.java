package tcs_most_asked;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rev=1;
		while(n>0)
		{	
			n=n%10;
			rev=rev*10+n;
			System.out.print(rev);
		}
		
		
	}

}
