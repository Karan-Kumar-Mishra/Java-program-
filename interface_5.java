interface Drawable
{
	void draw();
	static int cube(int x)
	{
		return x*x*x;
	}
}
class rectangle implements Drawable
{
	public void draw()
	{
		System.out.println("drawing rectangle");
	}
}
public class Main {
	public static void main(String[] args) {
	 Drawable d= new rectangle();
	 d.draw();
	 int x=Drawable.cube(3);
	 System.out.println("volume of cube : "+x);	
	}
}