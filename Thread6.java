import java.util.*;
import java.io.*;
class BaseThreadSeries extends Thread {
	public void run() {
		synchronized (this) {
			System.out.println("Thread " + Thread.currentThread().getName());
			try {
				System.out.println("wait() call for" + Thread.currentThread().getName());
				this.wait();
			} catch (Exception ex) {

			}
			System.out.println("notify()" + Thread.currentThread().getName());
		}
	}
}
class ThreadSeries1 extends Thread {
	BaseThreadSeries bts;
	public ThreadSeries1(BaseThreadSeries bts) throws Exception {
		this.bts = bts;
	}
	public void run() {
		synchronized (this.bts) {
			System.out.println("Thread started " + Thread.currentThread().getName());
			try {
				System.out.println("wait() called for " + Thread.currentThread().getName());
				this.bts.wait();

			} catch (Exception ex) {

			}
			System.out.println("notify()" + Thread.currentThread().getName());
		}
	}
}
class ThreadSeries2 extends Thread {
	BaseThreadSeries bts;
	public  ThreadSeries2(BaseThreadSeries bts) {
		this.bts = bts;
	}
	public void run() {
		synchronized (this.bts) {
			System.out.println("Thread strated" + Thread.currentThread().getName());
			System.out.println("wait() called for" + Thread.currentThread().getName());
			this.bts.notify();
			System.out.println("notify() " + Thread.currentThread().getName());

		}
	}
}
public class Main {
	public static void main(String[] args) throws Exception

	 {
      BaseThreadSeries bts= new BaseThreadSeries();
  ThreadSeries1 ts1=new ThreadSeries1(bts);
   ThreadSeries2 ts2=new ThreadSeries2(bts);
   Thread t1= new Thread(bts,"T1");         Thread t2= new Thread(ts1,"T2");
   Thread t3= new Thread(ts2,"T3");
   t1.start();
   t2.start();
   Thread.sleep(1000);
   t3.start(); 
	}
}

































