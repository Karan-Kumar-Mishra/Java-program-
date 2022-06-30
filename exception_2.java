import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException 
	{
		int a,b,c;
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
		System.out.println("enter the first number =>");
		a=Integer.parseInt(br.readLine()); System.out.println("enter the second number =>");
		b=Integer.parseInt(br.readLine());
		c=a/b;
		System.out.println(" result = "+c);
	}
}