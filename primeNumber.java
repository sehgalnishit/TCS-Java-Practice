
//check if number is negative if so, then print "number is negative" else pass the number as parameter to Check Prime function to check if its a prime or not 


package tcs_most_asked;
import java.util.Scanner;

public class primeNumber {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		check(n);
	}
	
	public static void check(int n)
	{
		if(n>=0)
		{
			String s= primeCheck(n);
			System.out.println(s);
		}
		else 
		{
			System.out.println(n+""+"is negative");
		}
	}

	public static String primeCheck(int n)
	{
		int count=0;
		for(int i=2;i<n;i++) 
		{
			if(n%i==0)
			{
				count=count+1;
			}
		}
		if(count ==0) 
		{
			return "Prime";
		}
		else 
		{
			return "Not Prime";
		}
		
	}

}
