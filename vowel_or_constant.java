import java.util.*;
class main
{
	public static void main(String[] args )
	{
		char ch;
		Scanner s= new Scanner(System.in);
		System.out.println("enter any alphabet=>");
		ch=s.next().charAt(0);
		if(ch=='a' || ch=='e' || ch=='a' || ch=='i' || ch=='a' || ch=='o' || ch=='u')
		{
			System.out.println("this is a vowel");
	
		}
		else
		{
			System.out.println("this is a constant");
	
		}
	}
}