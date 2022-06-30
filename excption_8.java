import java.util.*;
import java.io.*;
class AgeExcption extends Throwable
{
	String msg; 
	public AgeExcption()
	{
		msg="age must be between 13 to 19";
	}
	public String toString()
	{
		return msg;
	}
}
class student
{
	private int age;
	private String name;
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name=>");
		name=sc.next();
		System.out.println("enter age=> ");
		age=sc.nextInt();
		try{
	     	   if(age<13 || age >19)
		          { 
	    	   	throw new AgeExcption();
		         }
		}
		   catch(AgeExcption ex)
		   {
		    System.out.println(ex);
		    System.out.print("enter age =>");
		    age=sc.nextInt();	
		   }
		    	
}		
	
	public void display()
	{
		System.out.println("name =>"+name);
		System.out.println("age =>"+age);
	}
}
public class Main {
	public static void main(String[] args) {
  student s=new student();
  s.input();
  s.display();		
	}
}