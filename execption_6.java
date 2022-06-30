import java.util.*;
class Main
{
	public static void main(String args[])
	{
		int a,b,c;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter any two number =>");
		a=sc.nextInt();
		try{
			b=sc.nextInt();
			if(b==0)
			
				throw new ArithmeticException();
				c=a/b;
				
			}
			catch(ArithmeticException ex)
			{
				System.out.println("denominator should not be zero");
				c=0;
			}
			System.out.println("result ="+c);
			 
	}
}