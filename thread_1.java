import java.util.*;
//display main thread properties 
public class Main {
	public static void main(String[] args) {
		Thread t= Thread.currentThread();
		System.out.println("current thread "+t);
		t.setName("my name");
		System.out.println("prioirty "+t.getPriority());
		System.out.println("thread id =>"+t.getId());
		System.out.println("thread status "+t.isAlive());
		System.out.println(t);
		
		
	}
}