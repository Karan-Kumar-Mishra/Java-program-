public class Main {
	public static void main(String[] args)  
	{
		int k=0;
		int arr[]=new int[10];
		for(int i=0;i<10;i++)
		{
			arr[i]=k;
			k++;
		}
		System.out.println();
	try{
			for(int i=0;i<=10;i++)
		{
			System.out.println(arr[i]);
		}
	}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("exception");
		}
	}
}