import java.util.*;
public class Main {
	public static void main(String[] args) {
	
	   Scanner sc= new Scanner(System.in);
		int arr1[][]= new int[2][2];
		int arr2[][]= new int[2][2];
		int arr3[][]= new int[2][2];
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[1].length;j++)
			{
				System.out.println("enter the number =>");
			arr1[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<arr2.length;i++)
		{
			for(int j=0;j<arr2[i].length;j++)
			{
			  System.out.println("enter the number =>");
			  arr2[i][j]=sc.nextInt();
		    }
		}
		for(int i=0;i<arr3.length;i++)
		{
			for(int j=0;j<arr3[i].length;j++)
			{
	           arr3[i][j]=arr1[i][j]+arr2[i][j];			
			}
		}
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[i].length;j++)
			{
	          System.out.print("  "+ arr1[i][j]);			
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println("+");
		for(int i=0;i<arr2.length;i++)
		{
			for(int j=0;j<arr2[i].length;j++)
			{
	          System.out.print("  "+ arr2[i][j]);			
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		for(int i=0;i<arr3.length;i++)
		{
			for(int j=0;j<arr3[i].length;j++)
			{
	          System.out.print("  "+ arr3[i][j]);			
			}
			System.out.println();
		}
	}
}