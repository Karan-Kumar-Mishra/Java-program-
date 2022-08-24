class A  extends Thread
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			try{
				Thread.sleep(10000);
				
			}
			catch(Exception ex)
			{
				System.out.println(ex);
			}
		System.out.println("thread  A =>  "+i);
		}
	}
}
class B extends Thread
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			try{
				Thread.sleep(1000);
				
			}
			catch(Exception ex)
			{
				System.out.println(ex);
			}
		System.out.println("thread  B =>  "+i);
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