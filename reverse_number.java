import java.io.*;
public class Main {
	public static void main(String[] args) throws Exception
	 {
		System.out.println("enter the number");
		int num=0;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		num=Integer.parseInt(br.readLine());
		int n=num;
		int rev=0;
		int temp=0;
		while(n>0)
		{
			temp=n%10;
			n=n/10;
			rev=rev*10+temp;
		}
		System.out.println("reverse number => "+rev);
	}
}