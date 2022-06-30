import java.util.*;
class Area
{
	int a,b;
	public void setarea()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the length =>");
		a=sc.nextInt();
		System.out.println("enter the width =>");
			b=sc.nextInt();
		
		
	}
	public void showarea()
	{
		System.out.println("area =>"+(a*b));
}
}
public class Main {
	public static void main(String[] args) {
		Area s1= new Area();
		s1.setarea();
		s1.showarea();
	}
}