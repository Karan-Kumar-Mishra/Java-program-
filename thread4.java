class NewThread implements Runnable
{
	Thread t;
	 NewThread()
	{
		t= new Thread(this,"my Thread");
		System.out.println("child thread");      t.start();
	}
	public void run()
	{
		try{
			for(int i=5;i>0;i--)
			{
				System.out.println("child thread");
				Thread.sleep(1000);
			}
		}
			catch(Exception ex)
			{
				System.out.println("chid exception");
			}
			System.out.println("exiting chid thread");
	
	}
}
public class Main {
	public static void main(String[] args) {
		 NewThread t1= new  NewThread();
		 try{
		
		 	for(int i=1;i<=5;i++)
		 	{
		 	System.out.println("main thread " +t1);
		 	Thread.sleep(1000);	
		 		} 	
		 }
		 catch(Exception ex)
		 {
		 	System.out.println(ex);
		 }
	}
}