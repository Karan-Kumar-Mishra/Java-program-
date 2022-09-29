import java.util.*;
//reveres a string without string function
public class Main {
	public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
     StringBuffer s1,s2,s3;
     System.out.println("enter the string =>");
     s1=new StringBuffer(sc.next());
     char ch;
     for(int i=s1.length()-1;i>=0;i--)
     {
     	ch=s1.charAt(i);
     	System.out.print(ch);
     }	
	}
}