import java.util.*;
public class Main {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the first number = ");
		a=sc.nextInt();
		System.out.println("enter the second number = ");
		b=sc.nextInt();
		try{
			c=a/b;
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Denominator should not be zero");
			c=0;
		}
		System.out.println("answer is  :"+c);
	}
}