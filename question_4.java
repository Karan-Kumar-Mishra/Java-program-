abstract class A
{
	abstract void first();
	void second()
	{
		System.out.println("second ");
		first();
	}
}
abstract class B extends A
{
	void first()
	{
		System.out.println("first");
	}
	abstract void three();
}
 class C extends B
{
	@Override
	void three()
	{
		System.out.println("three");
	}
}
public class Main {
	public static void main(String[] args) {
	  C c=new C();
	  c.first();
	  c.second();	
	  c.three();
	}
}