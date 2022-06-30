interface drawable
{
	void draw();
}
class rectangle implements drawable
{
	public void draw()
	{
		System.out.println("drawing rectangle");
	}
	}
class circle implements drawable
{
	public void draw()
	{
		System.out.println("drawing circle");
	}
} 
public class Main {
	public static void main(String[] args) {
   drawable d=new circle();
   d.draw();		
	}
}