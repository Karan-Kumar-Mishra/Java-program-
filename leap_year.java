import java.util.*;
public class leap_year
{
	public static void main(String []args)
	{
		int year;
		System.out.println("enter the yera=> ");
		Scanner s= new Scanner(System.in);
		year=s.nextInt();
		if(year%400==0)
		{
			System.out.println(" this is a leap year ");

		}
		else if(year%4==0)
		{
				System.out.println(" this is a leap year ");
		}
		else
		{
				System.out.println(" this is a not leap year ");
		}
	}
}