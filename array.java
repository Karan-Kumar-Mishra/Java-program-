import java.io.*;
public class Main {
	public static void main(String[] args) throws Exception 
	{
		int arr[]=new int[5];
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the number of array=>");
		for(int i=0;i<arr.length;i++)
		{
		arr[i]=Integer.parseInt(br.readLine());	
		}
		for(int i=0;i<arr.length;i++)
		{
		System.out.println(arr[i]);	
		}
	}
}