import java.io.*;
public class Main {
	public static void main(String[] args) throws Exception
	 {
		String sum;
		int x,y,z;
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			System.out.println("enter the first number =>");
			x=Integer.parseInt(br.readLine());
			System.out.println("enter the first number =>");
				y=Integer.parseInt(br.readLine());
				z=x+y;
				sum=String.valueOf(z);
				System.out.println("sum =>"+sum);
	}
}