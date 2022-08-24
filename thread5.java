class Series
{
	void display(int x)
	{
		int i;
		System.out.println(" this is the method of series ");
		synchronized(this)
		{
			for(i=1;i<=x;i++)
			{
				try{
					Thread.sleep(1000);
				}
				catch(Exception ex)
				{
					System.out.println();
				}
				System.out.println(i);
			}
		}
	}
}
class SeriesThread1 extends Thread
{
	int x;
	Series s;
	public SeriesThread1(Series s,int x)
	{
		this.s=s;
		this.x=x;
		
		}
		public void run()
		{
			System.out.println("this is thread of SeriesThread1");
			s.display(x);
			} 
}
class SeriesThread2 extends Thread
{
	int x;
	Series s;
	public SeriesThread2(Series s,int x)
	{
		this.s=s;
		this.x=x;
		
		}
		public void run()
		{
			System.out.println("this is thread of SeriesThread2");
			s.display(x);
			} 
}
public class Main {
	public static void main(String[] args) {
	 Series s= new   Series();
	  SeriesThread1 s1= new SeriesThread1(s,5);
	   SeriesThread1 s2= new SeriesThread1(s,3);
	   s1.start();
	   s2.start();	
	}
}