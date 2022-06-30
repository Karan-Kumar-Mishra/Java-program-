class A
{
	String s="class a";
}
class B extends A
{
	String s="class b";
	{
		System.out.println(super .s);
		
	}
}
class C extends B
{
	String s="class c";
	{
		System.out.println(super.s);
	}
}
public class Main {
	public static void main(String[] args) {
	 C c=new C();
	 System.out.println(c.s);	
	}
}