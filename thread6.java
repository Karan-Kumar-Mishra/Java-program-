class BaseThreadSeries extends Thread
{
	public void run()
	{
		synchronized(this)
		{
			System.out.println(" Thread "+Thread.currentThread().getName());
			try
			{
				System.out.println("Wait()"+Thread.currentThread().getName());
			}
			catch(Exception ex)
			{
				
			}
			System.out.println("notify()"+Thread.currentThread().getName());
		}
	}
}
class ThreadSeries1 extends Thread
{
	BaseThreadSeries bts;
	public ThreadSeries1(BaseThreadSeries bts)
	{
	 this.bts=bts;	
	}
	public void run()
	{
	  synchronized(this.bts)
	  {
	 System.out.println("Thread "+Thread.currentThread().getName());  	  try
	 {
	 	System.out.println("wait()"+Thread.currentThread().getName());
	 	this.bts.wait();
	 }
	 catch( Exception ex)
	 {
	 	
	 }
	 System.out.println("notify()"+Thread.currentThread().getName());
	 
	  	}	
	}
}
class ThreadSeries2 extends Thread
{
	BaseThreadSeries bts;
	public ThreadSeries2(BaseThreadSeries bts)
	{
	 this.bts=bts;	
	}
	public void run()
	{
	  synchronized(this.bts)
	  {
	 System.out.println("Thread "+Thread.currentThread().getName());
	 System.out.println("wait()"+Thread.currentThread().getName());
	 this.bts.notify();
	 System.out.println("nottify()"+Thread.currentThread().getName());
  	  	}	
	}
}
public class Main {
	public static void main(String[] args) {
	 BaseThreadSeries bts= new BaseThreadSeries();
	ThreadSeries1 ts1= new ThreadSeries1(bts);
	ThreadSeries2 ts2= new ThreadSeries2(bts); 
	Thread t1= new Thread(bts,"t1");
	Thread t2= new Thread(ts1,"t2");
	Thread t3= new Thread(ts2,"t3");
	t1.start();
	t2.start();
	try{
	Thread.sleep(1000);
	}
	catch( Exception ex)
	{
		
	}
	t3.start(); 
	}
}



