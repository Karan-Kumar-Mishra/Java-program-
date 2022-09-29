import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception
	 {
	 	//input from file
		Scanner sc= new Scanner(System.in);
		FileInputStream fin= new FileInputStream("data.txt");
		int x;
		for(int i=0;i<=10;i++)
		{
			x=fin.read();
			System.out.println(x);
			System.out.println((char)x);
			} 
	}
}