import java.util.*;
class A extends Thread
{
	public void run() 
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("thread A "+i  );
			
		}
	}
}
class B extends Thread
{
	public void run() 
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("thread B "+i);
			 
		}
	}
}
public class Main {
	public static void main(String[] args)
	throws Exception
	 {
	 A obj1=new A();
	 B obj2=new B();
	 obj1.start();
	 obj2.start();	
	}
}