import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= new int[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=i;
		}
		for(int x:arr)
		{
			System.out.println(x);
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println("even number=>"+arr[i]);
			}
		}
	}
}