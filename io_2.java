import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception
	 {
	 	//output form file
		FileOutputStream fout;
		Scanner sc= new Scanner(System.in);
		fout= new FileOutputStream("data.txt");
		int  x;
		for(int i=0;i<=10;i++)
		{
			System.out.println("enter the element=>");
			x=sc.nextInt();
			fout.write(x);
			
		}
		fout.close();
		System.out.println("data is store in file successfully ");
	}
}