import java.util.*;
public class Main {
	public static void main(String[] args) {
		String str1,str2;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the first string =>");
		str1=sc.next();
		System.out.println("enter the  string to be search =>");
		str2=sc.next();
		int k=str1.indexOf(str2);
		if(k>=0)
		{
			System.out.println("String is found at position =>"+k);
			
		}
		else
		{
			System.out.println("string is not found ");
			
		}
	}
}