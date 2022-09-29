import java.util.*;
class temp
{
	String str,s;
	char ch;
	void input()
	{
		System.out.println("enter the string =>");
		Scanner sc= new Scanner(System.in);
		str=sc.nextLine();
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if(i==0 || str.charAt(i-1)==' ')
			{
				ch=str.charAt(i);
				s=String.valueOf(ch);
				s.toUpperCase();
				System.out.print(s);
			}
			System.out.print(str.charAt(i));
		}	
	}
}
public class Main {
	public static void main(String[] args) {
	temp t1= new temp();
	t1.input();
	}
}