import java.util.*;
class student
{
	private int roll;
	private String name;
	private float marks;
	public void input()
	{
	  Scanner sc= new Scanner(System.in);
	  System.out.println("enter your name =>");
	  name=sc.next();
	  System.out.println("enter your roll =>");
	  roll=sc.nextInt();
	  System.out.println("enter your    marks=>");
	  marks=sc.nextFloat();
	  	
	}
	public void display()
	{
		System.out.println("your name is => "+name);
		System.out.println("your roll number is => "+roll);
		System.out.println("your marks is =>"+marks);
			
	}
}
class Main
{
	public static void main(String args[])
	{
		student s[]= new student[5];
		for(int i=0;i<s.length;i++)
		{
			s[i]=new student();
		}
		for(int i=0;i<s.length;i++)
		{
			s[i].input();
		}
		for(int i=0;i<s.length;i++)
		{
			s[i].display();
		}
	}
}