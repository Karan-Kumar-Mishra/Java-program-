import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception 
	 {
		FileInputStream fin =new FileInputStream("data.txt");
		int data,count=0;
		int key=fin.read();
		for(int i=0;i<=10;i++)
		{
			
			data=fin.read();
			if(data==key)
			{
				count++;
			}
			System.out.println(data);
		} 
		System.out.println("occurrence of "+key+"  =>>"+count);
	}
}