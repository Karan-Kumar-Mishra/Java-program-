interface drawable
{
	void draw();
	default void msg()
	{
		System.out.println("default msg");
	}
}
class reactangle implements drawable
{
	public void draw()
	{
		System.out.println("reactangle draw");
	}
}
class circle implements drawable
{
	public void draw()
	{
		System.out.println("circle draw");
	}
}
public class Main {
	public static void main(String[] args) {
	          drawable d1;
	          d1=new  reactangle();
	          d1.draw();
	          d1.msg();
	          d1=new circle();
	          d1.draw();
	          d1.msg();	
	}
}