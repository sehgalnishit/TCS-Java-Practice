import java.util.*;

public class leapYear
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		if(Integer.toString(n).length()==4)
		{
			if((n%4==0 && n%100!=0 )|| n%400==0    )
			{
				System.out.println("Leap year");
			}
			else 
			{
				System.out.print("not a leap year");
			}
			
		}
		else
		{
			System.out.println("not of four digits");
		}
		
	}
}
