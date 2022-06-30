interface Shape
{
	float pi=3.14f;
	void area();
}
interface circle extends Shape
{
	 void display();
}
class calculate implements circle
{
	float r,a;
	public  calculate(float r)
	{
		this.r=r;
	}
	public void area()
	{
		a=pi*r*r;
	}
	public void display()
	{
		System.out.println(" area of circle => "+a);
	}
}
public class Main {
	public static void main(String[] args) {
	     calculate obj;
	     obj=new calculate(2.5f);
	     obj.area();
	     obj.display();	
	}
}