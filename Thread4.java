import java.util.*;
class A extends Thread
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("Thread A ");        }
	}
}
public class Main {
	public static void main(String[] args) {
    A obj= new A();
    obj.start();
    System.out.println("name =>"+obj.getName());
    System.out.println("id =>"+obj.getId());
    System.out.println("live or not =>"+obj.isAlive());
    System.out.println("state =>"+obj.getState());
    System.out.println("priority=>"+obj.getPriority());   		
	}
}





