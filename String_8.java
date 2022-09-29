import java.util.*;
class temp
{
	String str;
	int count;
	char ch;
	int   check(char ch)
	{
		if(ch=='a' || ch== 'e'|| ch=='i' ||ch=='o'|| ch=='u'||ch=='A'|| ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	
	void input()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the sting =>");
		str=sc.nextLine();
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if(check(ch)==1)
			{
				count++;
			}
		}
		System.out.print("the number of vowels is =>"+count);
	}
	
}
public class Main {
	public static void main(String[] args) {
	temp t1= new temp();
	t1.input();	
	}
}