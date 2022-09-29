import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception 
	{
		int arr[]= new int[10];
		Scanner sc= new Scanner(System.in);
		int data;
		FileOutputStream fout= new FileOutputStream("data.txt");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter the number =>");
			arr[i]=sc.nextInt();
			fout.write(arr[i]);
		}
		fout.close();
	}
}