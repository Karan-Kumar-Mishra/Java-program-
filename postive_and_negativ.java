import java.util.*;
public class Main {
	public static void main(String[] args) {
		int arr[]= new int [5] ;
		Scanner sc=new Scanner(System.in);
		int p=0,n=0;
		System.out.println("enter the number of array ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>0)
			{
				p++;
				
			}
			if(arr[i]<0)
			{
				n++;
					
			}
		}
		System.out.println("postive number =>"+p);
		System.out.println("negative  number =>"+n);
	}
}