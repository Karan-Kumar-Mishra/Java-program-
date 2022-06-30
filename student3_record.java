import java.util.*;
class student
{
	private int ron;
	private String name;
	private int[] marks;
	private float avg;
	public void input()
	{
		marks= new int[5];
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your name =>");
		name=sc.next();
		System.out.println("enter your roll number =>");
		ron=sc.nextInt();
		for(int i=0;i<marks.length;i++)
		{
			System.out.println("enter marks in subject  "+(1+i));
			marks[i]=sc.nextInt();
		}
	}
		public void display()
		{
			System.out.println("student name => "+name );
			System.out.println("student roll number => "+ron);
			for(int i=0;i<marks.length;i++)
			{
			System.out.println("enter marks in subject  "+(1+i)+"=>  "+marks[i]);
			avg=avg+marks[i];	
			}
			float total=avg/5.0f;
			System.out.println("average marks =>"+total);
		}
	
}

public class Main {
	public static void main(String[] args) {
       student s1= new student();
       s1.input();
       s1.display();
       
	}
}