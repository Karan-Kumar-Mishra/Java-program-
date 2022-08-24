import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) {
		int number;
		System.out.println("enter any number =>" );
		Scanner sc= new Scanner(System.in);
		number=sc.nextInt();
		String ch=Integer.toString(number);
		for(int i=0;i<ch.length();i++)
		{
			switch(ch.charAt(i))
			{
				case '1':
				System.out.print("one ");
				break;
				case '2':
				System.out.print("two ");
				break;
				case '3':
				System.out.print("three ");
				break;
				case '4':
				System.out.print("four ");
				break;
				case '5':
				System.out.print("five ");
				break;
				case '6':
				System.out.print("six ");
				break;
				case '7':
				System.out.print("seven ");
				break;
				case '8':
				System.out.print("eigth ");
				break;
				case '9':
				System.out.print("nine ");
				break;
				case '0':
				System.out.print("zero ");
				break;
				default:
				System.out.println("not found ");
				break;
			}
		}
		 
	}
}


















