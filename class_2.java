import java.util.*;
class person
{
	private String name;
	private int age;
	public person()
	{
		name="";
		age=0;
		
	}
	public void display()
	{
		System.out.println("name ="+name);
		System.out.println("age ="+age);
		
	}
}
class student extends person
{
    private String course;
    private int rno;
    public student()
    {
    	course="";
    	rno=0;
    }
    	public void display()
    	{
    		super.display();
    		System.out.println("course"+course);
    		System.out.println("rno"+rno);
    		}	
}
public class Main {
	public static void main(String[] args) {
	      person p;
	      student s;
	      p=new person();
	      System.out.println("super class with super class");
	     p.display();
	     p=new student();
	     System.out.println("super class with sub class");
	     p.display();
	     System.out.println("sub class with super class");
	     //p=new person();
	     System.out.println("sub class with super class");
	     s=new student();
	     s.display();              	
	}
}