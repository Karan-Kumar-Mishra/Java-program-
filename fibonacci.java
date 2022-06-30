import java.util.*;
public class Main {
	public static void main(String[] args) {
		int t1 = 0, t2 = 1, n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the any number =>");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println(" " + t1);
			System.out.println(" " + t2);
			t1 = t1 + t2;
			t2 = t1 + t2;
		}
	}
}