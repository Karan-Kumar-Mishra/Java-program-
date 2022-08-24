import java.util.*;
class book extends Exception
{
	int bookId;
	int price;
	String author;
	String title;
	String publication;
	int status;
	int issud;
	public void setdata()
	{
		Scanner sc= new Scanner(System.in);
	System.out.println("enter the book id=>>");
	bookId=sc.nextInt();
	System.out.println("enter the price =>");
	price=sc.nextInt();
	System.out.println("enter the author =>");
	author=sc.next();
	System.out.println("enter the title =>");
	title=sc.next();
	System.out.println("enter the publication =>");
	publication=sc.next();
  System.out.println("enter the status =>");
    status=sc.nextInt();
    System.out.println("book is issud or not(1/0)==> ");
    issud=sc.nextInt();		
	}
	public void showdata()
	{
		System.out.println("bookid =>"+bookId);
		System.out.println("price =>"+price);
		System.out.println("author =>"+author);
		System.out.println("title =>"+title);   System.out.println("publication =>"+publication);
		System.out.println("status =>"+status);
		System.out.println("book is issud or not=>>"+issud);
		
		try
		{
		if(issud==1 && status==0)
		{
			throw new book();
		}
		}
		catch(Exception e)
		{
			System.out.println("sorry this book is lost ");
		}
	}
}
public class Main {
	public static void main(String[] args) {
   book b1= new book();
   b1.setdata();
   b1.showdata();		
	}
}




