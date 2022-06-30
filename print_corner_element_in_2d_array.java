public class Main {
	public static void main(String[] args) {
		  int k=0;
		  int arr[][]= new int[3][4];
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
		  	for(int j=0;j<arr[i].length;j++)
		  	{
		  		if((i==1 &&  j==1  ) ||(i==1 && j==2  ))
		  		{
		  			System.out.print("   ");
		  			continue;
		  		
		  		}
		  		System.out.print("  "+arr[i][j]);
		  		
		  	}
		  	System.out.println();
		  }
		 
	}
}