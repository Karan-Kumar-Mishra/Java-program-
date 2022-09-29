import java.util.*;
public class Main {
	public static void main(String[] args) {
		String s;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the string =>");
		s=sc.nextLine();
		char ch;
		for(int i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
			if(i==0 || s.charAt(i-1)==' ')
			{
				System.out.print(ch+".");
			}
		}
	}
}