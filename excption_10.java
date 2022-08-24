import java.util.*;
class Execption extends Throwable
{
	public  Execption()
	{
	 System.out.println("roll number must positive ?");	
	}
}
class student
{
	private String name;
	private int age;
	private int roll;
	public void input()
	{
	 Scanner sc= new Scanner(System.in);
	 System.out.println("enter your name =>");
	 name= sc.next();
	 System.out.println("enter your age =>");
	 age=sc.nextInt();
	 System.out.println("enter your roll number  =>");
	 roll=sc.nextInt();
	 try{
	 		if(roll<0)
	 	{
	 		throw new Execption(); 
	 	}
	 }
	 	catch(Execption ex)
	 	{
	 		System.out.println(ex);
	 		System.out.println("enter your roll number  =>");
	 roll=sc.nextInt();
	 	}
	}
	public void display()
	{
		System.out.println("name =>"+name);
		System.out.println("age =>"+age);       System.out.println("roll =>"+roll);
		
	}
	
}
public class Main {
	public static void main(String[] args) {
	 student s1= new student();
	 	s1.input();
	 	s1.display();
	}
}