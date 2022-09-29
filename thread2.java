import java.util.*;
//changing name of main thread 
public class Main {
	public static void main(String[] args) {
		Thread t1= Thread.currentThread();
		System.out.println("befor changing name =>"+t1.getName());
		t1.setName("mythread");
		System.out.println("after changing name =>"+t1.getName());
		
	}
}