import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args)  
	{
		FileInputStream fin;
		int x,i,s=0;
		try{
			fin= new FileInputStream("data.txt");
			for(i=1;i<=10;i++)
			{
				x=fin.read();
				System.out.println("number =>"+x);
				s=s+x;
		   
				
			}
					System.out.println("sum =>"+s);
					fin.close();
		}
		catch(Exception ex)
		{
			
		}
	}
}