import java.util.*;
public class Main {
	public static void main(String[] args) {
		int arr[]= new int[10];
		int n=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=n;
			n++;
		}
		for(int x: arr)
		{
			try
			{
			Thread.sleep(500);
			}
			catch(Exception e)
			{
				
			}
			System.out.println(x);
		}
	}
}