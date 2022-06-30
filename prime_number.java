public class Main {
	public static void main(String[] args) {
		int i, n, flag = 1;
		n = 13;
		for (i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				flag = 0;
				break;
			}

		}
		if (flag == 1) {
			System.out.println(n + " is prime number");
		} else {
			System.out.println(n + " is not prime number");
		}
	}
}