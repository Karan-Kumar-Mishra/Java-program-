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
	void setmarks(float k)
	{
		marks=marks+k;
	}
}
public class Main {
	public static void main(String[] args) {
		student s1=new student();
		s1.input();
		s1.setmarks(20.5f);
		s1.display();
		
	}
}