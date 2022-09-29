public class Main {
	public static void main(String[] args) {
		int arr[]= new int[10];
	try
	{
			for(int i=0;i<=10;i++)
		{
			arr[i]=i;
		}
	}
	catch(Exception ex)
	{
		System.out.println("error =>  ");
		System.out.println(ex);
	}
	}
}