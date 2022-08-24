import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args)  
	{
		FileOutputStream fout;
		Scanner sc= new  		Scanner(System.in);
		int x,i;
		try
		{
			fout=new FileOutputStream("data.txt");
			for( i=1;i<=10;i++)
			{
				System.out.println("enter any number=> ");
				x=sc.nextInt();
				fout.write(x);
				}
				fout.close(); 
		}
		catch(Exception ex)
		{          }
		System.out.println("data is successfully saved !");
	}
}