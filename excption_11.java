import java.util.*;
class Excption extends Throwable
{
	public Excption()
	{
		System.out.println("salary should be between 4000 to 50000");
	}
}
class employee
{
	private String name;
	private int id;
	private int age;
	private String address;
	private int salary;
	public void input()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter  name =>");
		name=sc.next();
		System.out.println("enter  id =>");
		id=sc.nextInt();
		System.out.println("enter  age =>");
		age=sc.nextInt();
		System.out.println("enter  address =>");
		address=sc.next();
		System.out.println("enter  salary =>");
		salary=sc.nextInt();
	 try{
	 	if(salary<400 || salary >50000)
	 	{
	 		 
	 		 throw new Excption();
	 		 

	 	}
	 	}
	 	catch(Excption ex)
	 	{
	 		System.out.println(ex);
	 		salary=8500;
	 	}	
	}
	public void display()
	{
		System.out.println("name =>"+name);
		System.out.println("id =>"+id);
		System.out.println("address =>"+address);
		System.out.println("salary =>"+salary);
	}
	 
}
public class Main {
	public static void main(String[] args) {
      employee e1=new employee();
      e1.input();
      e1.display();		
	}
}