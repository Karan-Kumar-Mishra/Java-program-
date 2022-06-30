import java.util.*;
public class Main {
	public static void main(String[] args) {
		int k=10;
		int arr[]=new int[8];
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			//System.out.println("enter any number->");
			//arr[i]=sc.nextInt();
			arr[i]=k;
			k--;
		}
		System.out.println("befor sorting");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("  "+arr[i]);
		}
		
				
	for (int i = 0; i < arr.length; i++)
	{     
        for (int j = i+1; j < arr.length; j++)                   {   
                   int temp;
                   if(arr[i] > arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
                 }     
            }     
        }
		System.out.println("after sorting");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("  "+arr[i]);
		}
	}
}