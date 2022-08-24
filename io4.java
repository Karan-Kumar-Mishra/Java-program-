import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws Exception 
	{
		 	int data;
		 	FileOutputStream fout= new FileOutputStream("data.text");
		 	Scanner sc= new Scanner(System.in);
		 	 System.out.println("enter nay number =>");
		 	 data=sc.nextInt();
		 	 fout.write(data);
		 	 fout.close();
		 	 FileInputStream in= new FileInputStream("data.text");
		 	 int data2=in.read();
		 	 System.out.println("data =>"+data2); 
 	 	}
}