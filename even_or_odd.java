import java.util.*;
public class Main {
	public static void main(String[] args) {
		int arr[]= new int [5] ;
		Scanner sc=new Scanner(System.in);
		int e=0,o=0;
		System.out.println("enter the number of array ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
			 e++;	
			}
			if(arr[i]%2!=0)
			{
				o++;System.out.println("total even number=>"+e);
			}
		}
		System.out.println("total even number=>"+e);
		System.out.println("total odd number=>"+o);
	}
}