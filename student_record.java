import java.util.*;
class student{
	private int roll;
	private String name;
	public void input()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your roll number=>");
		roll=sc.nextInt();
			System.out.println("enter your  name=>");
			name=sc.next();
	}
	public void display()
	{
		System.out.println("name => "+name);
		System.out.println("roll number =>"+roll);
	}
}
public class Main {
	public static void main(String[] args) {
	
		student s1=new student();
		s1.input();
		s1.display();	
	}
}