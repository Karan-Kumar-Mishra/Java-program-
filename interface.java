interface Shap
{
	float pi=3.14f;
	void area();
}
class circle implements Shap
{
	float a,r;
	public circle(float r)
	{
		this.r=r;
	}
	public void area()
	{
		a=pi*r*r;
	}
	public void display()
	{
		System.out.println("area of circle ="+a);
	}
}
public class Main {
	public static void main(String[] args) {
	circle obj;
	obj=new circle(2.5f);
	obj.area();
	obj.display();	
	}
}