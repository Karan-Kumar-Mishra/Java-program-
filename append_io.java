import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) 
	 {
		FileOutputStream fout;
		Scanner sc= new 	Scanner(System.in);
		int x,i;
		try {
			fout= new  FileOutputStream("data.txt",true);
			for(i=1;i<=10;i++)
			{
				System.out.println("enter any number =>");
				x=sc.nextInt();
				fout.write(x);
			}
		
			fout.close();	
		}
	catch(Exception ex)
	{
		
	}
	 }
}