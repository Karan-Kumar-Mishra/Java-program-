import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] mat = new int[3][4];
		int sum = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.println("enter the element=>");
				mat[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {

				sum = sum + mat[i][j];
			}
		}
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print("   " + mat[i][j]);
			}
			System.out.println();
		}
		System.out.println("sum is =>" + sum);
	}
}