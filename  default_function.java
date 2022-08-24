import java.io.*;
import java.util.*;
interface A
{
	public  void fun1();
    default void fun2()
	{
		System.out.println("this is default function");
	}
}
class temp implements A
{
	public void fun1()
	{
		System.out.println("this is fun1 function ");
	}
	
}
public class Main {
	public static void main(String[] args) {
	temp t1= new temp();
	t1.fun1();
	t1.fun2();	
	}
}