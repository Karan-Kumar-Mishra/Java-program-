import java.util.*;
class temp
{
	static synchronized void display()
	{
		System.out.println("display call function");
	}
}
class A extends Thread 
{ 
  public void run()
  {
  	 temp t1= new temp();
  	for(int i=0;i<=5;i++)
  	{
  		System.out.println(" Thread A =>"+i);
  		t1.display();
  	}
  	
  }
	
}
class B extends Thread 
{ 
  public void run()
  {
  	temp t1= new temp();
  	for(int i=0;i<=5;i++)
  	{
  		System.out.println(" Thread B =>"+i);
  		t1.display();
  	}
  	
  }
}
public class Main {
	public static void main(String[] args) {
	A obj1= new A();
	B obj2= new B();
	
  obj1.start();
  obj2.start();	
	}
}