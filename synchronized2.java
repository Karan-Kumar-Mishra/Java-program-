import java.io.*;
class Series
{
	static void display(int x)
	{
		int i;
		System.out.println("this is the methode of series");
		synchronized(Series.class)
		{
			for(i=1;i<=20;i++)
			{
		      try
		      {
		      	Thread.sleep(1000);
		      }
		      catch(Exception ex)
		      {
		      	
		      }
		      System.out.print(i);		
			}
		}
	}
}
class seriesThread1 extends Thread
{
	int x;
	Series s;
	public seriesThread1(Series s,int x)
	{
	  this.s=s;
	  this.x=x;	
	}
	public void run()
	{
		System.out.println("This is thread of seriesThread1");
		s.display(x);
	}
}
class seriesThread2 extends Thread
{
	int x;
	Series s;
	   public seriesThread2(Series s,int x)
	{
	  this.s=s;
	  this.x=x;	
	}
	public void run()
	{
		System.out.println("This is thread of seriesThread2");
		s.display(x);
	}
}
public class Main {
	public static void main(String[] args) {
	Series s1= new Series();
	Series s2= new Series();
	seriesThread1 t1= new seriesThread1(s1,5);
	seriesThread2 t2= new seriesThread2(s2,3);
	t1.start();
	t2.start();	
	}
}