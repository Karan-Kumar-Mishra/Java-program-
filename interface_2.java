interface A
{
	void m1();
}
interface B
{
	void m2();
}
class sample implements A,B
{
	@Override
	public void m1()
	{
		System.out.println("welcome inside the method m1");
	}
	public void m2()
	{
	  	System.out.println("welcome inside the method m2");	
	}
}
public class Main {
	public static void main(String[] args) {
	  sample obj=new sample();
	  obj.m1();
	  obj.m2();	
	}
}