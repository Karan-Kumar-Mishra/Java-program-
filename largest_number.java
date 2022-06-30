import java.util.*;
public class Main {
	public static void main(String[] args) {
		int larg,largs,k=0;
		int arr[]=new int[8];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=k;
			k++;
		}
		larg=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>larg)
			{
				larg=arr[i];
			}
		}
		largs=arr[0];
		
		for(int j=0;j<arr.length-1;j++)
		{
			if(arr[j]>largs)
			{
				largs=arr[j];
			}
		}
		for(int i:arr)
		{
			System.out.println(" "+i);
		}
		System.out.println("larg number -> "+larg);
		System.out.println("second larg number -> "+largs);
		
		
	}
}