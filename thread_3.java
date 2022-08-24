class NewThread extends Thread {
	public NewThread() {
		super("my thread");
		System.out.println("child thread :" + this);
	}
	public void run() {
		try {
			for (int i = 5; i > 0; i++) {
				System.out.println("child thread: " + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("child interrupted");
		}
		System.out.println("exiting child thred");
	}
}
public class Main {
	public static void main(String[] args) {
		NewThread t2 = new NewThread();
		t2.start();
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println("main thread " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("main thread Interrupted");
		}
		System.out.println("main thread exiting ");
	}
}