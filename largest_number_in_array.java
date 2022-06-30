import java.util.*;
public class Main {
	public static void main(String[] args) {
		//find largest  element
		Scanner sc = new Scanner(System.in);
		int larg;
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter the element =>");
			arr[i] = sc.nextInt();
		}
		larg = arr[0];
		for (int i = 0; i < arr.length; i++) {

			if (larg < arr[i]) {
				larg = arr[i];
			}
		}
		System.out.println("largest number is=>" + larg);
	}
}