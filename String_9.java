import java.util.*;
class temp
{
	String str;
	int count=0;
	char ch;
	void input()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the String =>");
		str=sc.nextLine();
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if(ch!=' ')
			{
				count++;
			}
		}
		System.out.println("the number of words in string is => "+count);
	}
}
public class Main {
	public static void main(String[] args) {
	temp t1= new temp();
	t1.input();	
	}
}