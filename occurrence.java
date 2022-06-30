import java.util.*;
public class Main {
	public static void main(String[] args) {
		int arr[] = new int[5];
		int n, occ = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter the number=>");
			arr[i] = sc.nextInt();
		}
		System.out.println("enter the number to check occurrence=>");
		n = sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (n == arr[i]) {
				occ++;
			}
		}
		System.out.println("occurrence=> " + occ);


	}
}