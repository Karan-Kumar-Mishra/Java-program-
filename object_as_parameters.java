import java.util.*;
class student
{
	private int rno;
	private String name;
	private float avgmarks;
	public void input()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your name =>");
		name=sc.next();
		System.out.println("enter your roll number =>");
		 rno=sc.nextInt();
		 System.out.println("enter your marks =>");
		 avgmarks=sc.nextFloat();
		 
	}
	public void display()
	{
		System.out.println(" name =>"+name);
		System.out.println(" roll number =>"+rno);
		System.out.println(" marks is =>"+avgmarks);
	}
	public float getAvgMarks()
	{
	    return avgmarks;	
	}
	public student compare(student s1)
	{
		student max;
		if(s1.getAvgMarks()>this.getAvgMarks())
		{
			max=s1;
		}
		else
		{
			max=this;
		}
		return max;
	}
}
public class Main{
	 public static void main(String args[])
	 {
	    student s1=new student();
	    student s2=new student();
	    student s3=new student();
	    s1.input();
	    s2.input();
	    s3=s1.compare(s2);
	    s3.display();    	
	 }
}