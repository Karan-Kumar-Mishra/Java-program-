public class Main {
	public static void main(String[] args) {
		int k = 0;
		int sum = 0;
		int arr[][] = new int[4][4];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = k;
				k++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("sum-> " + sum);
			sum = 0;
			for (int j = 0; j < arr.length; j++) {
				sum = sum + arr[i][j];
			}

		}
		System.out.println("sum-> " + sum);
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(" " + arr[i][j]);

			}
			System.out.println();
		}
	}
}