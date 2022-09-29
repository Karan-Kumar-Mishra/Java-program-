//program in java to display properties of main thred
public class Main {
	public static void main(String[] args) {
		 Thread t1=Thread.currentThread();
		 System.out.println("thread  name =>"+t1.getName());
		 System.out.println("thread priority =>"+t1.getPriority());
		 System.out.println("thread id  =>"+t1.getId());
		 System.out.println("thread is live or not  =>"+t1.isAlive());
     System.out.println("Thread state =>"+t1.getState());
    
	}
}