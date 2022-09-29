import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws Exception 
	{
		FileInputStream fin=new FileInputStream("data.txt");
		int a,sum=0;
		for(int i=0;i<=10;i++)
		{
			a=fin.read();
			System.out.println((char)a);
			sum=sum+a;
		}
		System.out.println("sum in char => "+(char)sum);
			System.out.println("sum in int => "+sum);
	}
}