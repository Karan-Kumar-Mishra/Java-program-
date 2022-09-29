import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception 
	 {
		Scanner sc= new Scanner(System.in);
		FileOutputStream fout= new FileOutputStream("data.text",true);
		int data;
		for(int i=0;i<=10;i++)
		{
			System.out.println("enter the data => ");
			data = sc.nextInt();
			fout.write(data);
		}
		fout.close();
		System.out.println("data is append successfully ");
	}
}