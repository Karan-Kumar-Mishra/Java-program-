import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int k=0;
		int[][] arr=new int[3][4];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
			
				arr[i][j]=k;
				k++;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<1;j++)
			{
				System.out.print("  "+arr[i][j]);
			}
			System.out.println();
		}
		
	}
}