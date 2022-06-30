class person
{
	private String name;
	private int age;
	public person()
	{
			System.out.println("constructor of person ");
		name="";
		age=0;
	}
	public person(String s,int a)
	{
		name=s;
		age=a;
	}
	public void person_display()
	{
		System.out.println("name =>"+name);
		System.out.println("age =>"+age);
	}
}
class student extends person
{
	private String course;
	private int rno;
	public student()
	{
		System.out.println("constructor of student ");
		course="";
		rno=0;
	}
	public student(String s2 ,int r, String n, int a)
	{
		super(s2,r);
		System.out.println("parameterised constructor of student ");
		course=s2;
		rno=a;
	}
	public void student_display()
	{
		System.out.println("course =>"+course);
		System.out.println("roll number =>"+rno);
    }
}
public class Main {
	public static void main(String[] args) {
	 person p1=new person();
	 student s1=new student();
	  
	  student s2=new student( " Amint ",17,"mba",101);     
	  p1.person_display();
	  s2.student_display();    	
	}
}