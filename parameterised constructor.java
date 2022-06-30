import java.util.*;
class person
{
	int age;
	String name;
	public  person()
	{
		age=0;
		name=" ";
		System.out.println("person constructor ");
	}
	public person(int a,String s)
	{
			System.out.println("person parameterised constructor ");
		age=a;
		name=s;
	}
	public void person_display()
	{
		System.out.println("age is => "+age);
		System.out.println("name is => "+name);
	}
}
class student extends person
{
	int rno;
	String course;
	public  student()
	{
			System.out.println("student constructor ");
		rno=0;
		course=" ";
	}
	public  student(int r,String c)
	{
	  	System.out.println("student constructor ");
	  rno=r;
	  course=c;	
	}
	public void student_display()
	{
		System.out.println("roll number=> "+ rno);
		System.out.println(" course =>"+course);
	}
}
public class Main {
	public static void main(String[] args) {
	 person p1= new person();
	 student s1= new student();
	 person p2=new person(12,"zack");
	 student s2= new student(34,"bca"); 	 p2.person_display();
	 s2.student_display();
	}
}