import java.util.*;
class person
{
	private String name;
	private int age;
	public void input()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your name=>");
		name =sc.next();
		System.out.println("enter your age=> ");
		age=sc.nextInt();
		 
	}
	public void display()
	{
		System.out.println("your name is=>"+name);
			System.out.println("your name is=>"+age);
	}
}
class student extends person
{
	private int roll;
	private String course;
	 public void getdata()
	{
		input();
		Scanner s=new Scanner(System.in);
		System.out.println("enter your course => ");
	  course=s.next();	 
	}
 public 	void display_data()
	{
		display();
	    System.out.println(" your course is=>"+course);
	    System.out.println(" your roll number =>"+course);	
	}
}
public class Main {
	public static void main(String[] args) {
	   student s1=new student();
	   s1.getdata();
	   s1.display_data();	
	}
}