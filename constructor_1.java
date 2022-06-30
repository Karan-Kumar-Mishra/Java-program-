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
}
public class Main {
	public static void main(String[] args) {
	    System.out.println("person record");
	   person p=new person();
	   System.out.println("student record");
	   student s=new student();
	    	
	}
}