import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		int base,sum =1,power,i;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter base=>");
		base=sc.nextInt();
		System.out.println("enter power=>");
			
		int res=1;	
			power=sc.nextInt();
		for(i=1;i<=power;i++)
		{
			 res=base*res;
        }
		
				System.out.println("result=>"+res);
		
	}
}