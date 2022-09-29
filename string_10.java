import java.util.*;
class strn
{
		int index;
		public int pos(StringBuffer str)
		{
			 char ch;
	           for(int i=0;i<str.length();i++)
		           {
		 	ch=str.charAt(i);
			                 if(ch==' ')
			                   {
			                      	index=i; 
			                    }
		           }
		           return index;
		}
}
public class Main {
	public static void main(String[] args)
	 {
	 	
		strn st= new strn();
		Scanner sc= new Scanner(System.in);
		StringBuffer str,str1;
		System.out.println("enter the string =>");
		str=new StringBuffer(sc.nextLine());
		str=str.reverse();
		int x=st.pos(str);
		int y=str.length();
	   str1= new StringBuffer(str.substring(x,y));
	  
		
		System.out.print(str1);
		System.out.print(" "+str.delete(6,str.length()));
	}
}



