import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int arr[]= new int[10];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter the number " +i+"=>");
			arr[i]=sc.nextInt();
		}
		int s;
		System.out.println(" enter element to be search =>");
		s=sc.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			if(s==arr[i])
			{
				System.out.println("data is found ");
				System.out.println("data => "+arr[i]+" index=> "+i);
			}
		}
	}
}