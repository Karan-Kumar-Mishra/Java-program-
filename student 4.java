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
	float getmark()
	{
		return marks;
	}
	
}
public class Main {
	public static void main(String[] args) {
		student s1= new student();
		student s2=new student();
		s1.input();
		s2.input();
	
		if(s1.getmark()>s2.getmark()
		)
		{
			s1.display();
     	}
     	else{
     		
	         s2.display();
     	}
	}
	
}