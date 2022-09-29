import java.util.*;

public class Main {
	public static void main(String[] args) {
    String str1,str2;
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the first string =>");
    str1=sc.next();
    System.out.println("enter the second string =>");
     str2=sc.next();
     if(str1.equals(str2))
     {
     	System.out.println("both string are same ");
     	}
     	else{
     		 	System.out.println("both string are not same ");
     		}		
     		if(str1.equalsIgnoreCase(str2))
     		{
     			 	System.out.println("both string are same ");
     		}
     		else
     		{
     			 	System.out.println("both string are not same ");
     		}
     		str1=str1.concat(str2);
     	  if(str1.isEmpty())
     	  {
           System.out.println("string is empty");    	  	
     	  	}	
     	  	else
     	  	{
     	  	  System.out.println("string is not empty"); 	
     	  	}
     	  	System.out.println("first string =>"+str1+"second string => "+str2);
	}
}






