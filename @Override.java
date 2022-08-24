import java.util.*;
import java.io.*;
interface A
{
	public void fun1();
}
interface B
{
	public void fun2();
}
class temp implements  A, B
{
	@Override
	public void fun1()
	{
		System.out.println("this is fun1 ");
	}
	@Override
	public void fun2()
	{
		System.out.println("this is fun2 ");
	}
}
public class Main {
	public static void main(String[] args)   
	{
	  temp t1= new temp();
	  t1.fun1();
	  t1.fun2();	  
	}
}