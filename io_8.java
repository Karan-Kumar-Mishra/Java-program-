import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception 
	{
		int arr[]= new int[10];
	FileInputStream fin= new FileInputStream("data.txt");
		for(int i=0;i<arr.length;i++)
		{
		    arr[i]=fin.read();
			System.out.println(arr[i]);
		}
		fin.close();
	}
}