import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception 
	 {
		FileInputStream fout= new FileInputStream("data.txt");
		int data,count=0;
		for(int i=0;i<=10;i++)
		{
			data=fout.read();
			if(data%2==0)
			{
				System.out.println(data);
				count++;
			}
		}
		System.out.println("total number of even number => "+count); 
	}
}