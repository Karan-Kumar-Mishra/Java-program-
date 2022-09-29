import java.util.*;
class strn
{
		public int pos(StringBuffer str)
		{
			 int r=0;
			 char ch;
	           for(int i=0;i<str.length();i++)
		           {
		 	ch=str.charAt(i);
			                 if(ch==' ')
			                   {
			                      	r= i;  
			                    }
		           }
		           return r;
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
	   str1=new StringBuffer(str.substring(x,y));
	  
		System.out.println("after reverse the string =>"+str);
		System.out.println("after reverse =>"+str1);
	}
}



