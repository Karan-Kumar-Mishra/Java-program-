import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int k;
		int arr1[][]=new int[3][4];
		int arr2[][]=new int[3][4];
		int arr3[][]=new int[3][4];
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[i].length;j++)
			{
			 System.out.println("enter the element first matrix=> ");
			arr1[i][j]=sc.nextInt(); 
			}
		}
		
		//---------------
		for(int i=0;i<arr2.length;i++)
		{
			for(int j=0;j<arr1[i].length;j++)
			{
			   System.out.println("enter the element second matrix=> ");
			arr2[i][j]=sc.nextInt(); 
			  	
			}
		}
		//-------
		for(int i=0;i<arr3.length;i++)
		{
			for(int j=0;j<arr3[i].length;j++)
			{
	         arr3[i][j]=arr1[i][j]+arr2[i][j];			        }
		}
		//-----
		for(int i=0;i<arr3.length;i++)
		{
			for(int j=0;j<arr3[i].length;j++)
			{
	        System.out.print(" "+ arr3[i][j]);
	        }
	        System.out.println();
		}
		
	}
}