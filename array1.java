import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[10];
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter the element=>");
			arr[i]=sc.nextInt();
		}
		for(int j=0;j<arr.length;j++)
		{
			sum=sum+arr[j];
		}
		for(int k=0;k<arr.length;k++)
		{
			System.out.println("array element "+arr[k]);
		}
			System.out.println("sum of array element=>"+sum);
	}
}