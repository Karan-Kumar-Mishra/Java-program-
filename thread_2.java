
public class Main {
	public static void main(String[] args) {
		Thread t= Thread.currentThread();
		System.out.println(" current thread :"+t);
		try{
			for(int n=5;n>0;n--)
			{
				System.out.println("  "+n);
				Thread.sleep(1000);
			}
	}
		catch(InterruptedException e)
		{
			System.out.println(" main thread interrupted");
		}
	}
}