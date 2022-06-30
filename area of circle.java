abstract class Shape
{
	abstract void area();
}
final class circle extends Shape
{
	float r;
	final float pi=3.14f;
	float a;
	public circle(float r)
	{
		this.r=r;
	}
	void area() 
	{
		a=pi*r*r;
		System.out.println(" area of circle : "+a);
	}
}
public class Main {
	public static void main(String[] args) {
	//   Shape s=new Shape();
	   Shape s=new circle(4.25f);
	   s.area();	
	}
}