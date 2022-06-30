import java.util.*;
class number
{
	private int x,y,z;
	private static int a,b,c;
	public void input1()
	{
	  Scanner sc= new Scanner(System.in);
	  System.out.println("enter the first number=>");
	  x=sc.nextInt();
	  System.out.println("enter the second number=>");
	  y=sc.nextInt();
	  z=x+y; 	
	}
	public static void input2() 
	{
	    Scanner sc= new Scanner(System.in);
	  System.out.println("enter the first number=>");
	  a=sc.nextInt();
	  System.out.println("enter the second number=>");
	  b=sc.nextInt();
	  c=a+b;
	}
	void display()
	{
	  System.out.println("a+b="+(a+b));
	   System.out.println("x+y="+(x+y));
	  		
	}
}
public class Main {
	public static void main(String[] args) {
		number n1= new number();
		n1.input1();
		n1.input2();
		n1.display();
				}
}