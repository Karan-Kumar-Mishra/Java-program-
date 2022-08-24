import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		int a, b;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the first number =>");
		a = Integer.parseInt(br.readLine());
		System.out.println("enter the second number =>");
		b = Integer.parseInt(br.readLine());
		System.out.println("addtion =>" + (a + b));
	}
}