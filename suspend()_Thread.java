import java.util.*;
class A extends Thread
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("Thread A"+i);
			 if(i==2)
			 {
			 	this.suspend();
			 }
			 if(i==6)
			 {
			 	this.resume();
			 }
			 
			try{
				Thread.sleep(1000);
				
			}
			catch(Exception ex)
			{
				
			}
		}
	}
}
class B extends Thread
{
	public void run()
	{
		A ob= new A();
		for(int i=0;i<=10;i++)
		{
			System.out.println("Thread B"+i);
			
			try{
				Thread.sleep(1000);
				
			}
			catch(Exception ex)
			{
				
			}
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
