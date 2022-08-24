import java.util.*;
class temp
{
	public  temp fun1()
	{
		System.out.println("function 1");
		return this;
	}
	public temp fun2()
	{
		System.out.println("function 2");
		return this;
	}
	public  temp fun3()
	{
		System.out.println("function 3");
		return this;
	}
	public  temp fun4()
	{
		System.out.println("function 4");
		return this;
	}
	
}
public class Main {
	public static void main(String[] args) {
	temp t1= new temp();
	t1.fun1().fun2().fun3().fun4();	
	}
}