public class Main {
	public static void main(String[] args) {
		int k = 0;
		int arr[][] = new int[4][4];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = k;
				k++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(" " + arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		int v = 0;
		int j = 3;
		for (int i = 0; i < 4; i++) {

			for (j = 0; j < v; j++) {

				System.out.print(" " + arr[i][j]);

			}
			v++;
			System.out.println();
		}
	}
}