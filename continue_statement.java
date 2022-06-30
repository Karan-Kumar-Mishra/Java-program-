public class Main {
	public static void main(String[] args) {
		int i,n=16;
		for(i=1;i<=n;i++)
		{
			if(i%5==0)
			{
				continue;
			}
			System.out.println(i);
		}
	}
}