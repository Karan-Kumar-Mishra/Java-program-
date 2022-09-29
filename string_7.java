import java.util.*;

public class Main {
	public static void main(String[] args) {
	  StringBuffer str,str2;
   Scanner sc= new Scanner(System.in);
   System.out.println("enter string =>");
   str=new StringBuffer(sc.nextLine());    	str2=str.reverse();
     if(str==str2)
     {
             System.out.println("this is a palindrome string");
      }
      else
      {
             System.out.println("this is a not palindrome string");
             }	           
		           
	}
}