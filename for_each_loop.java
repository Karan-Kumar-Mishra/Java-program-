import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter the element=>");
			arr[i] = sc.nextInt();
		}
		for (int x : arr) {
			sum = sum + x;
		}
		for (int j : arr) {
			System.out.println("element is =>" + j);
		}
		System.out.println("sum is =>" + sum);
	}
}