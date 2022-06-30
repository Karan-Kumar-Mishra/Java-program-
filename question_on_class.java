class A
{
	int i=10;
}
class B extends A
{
	int i=20;
}
public class Main {
	public static void main(String[] args) {
	  A a= new A();
	  System.out.println("a =>"+a.i);	
	}
}