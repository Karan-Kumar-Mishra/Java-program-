import java.util.*;
abstract class shap{
	abstract void draw();
	
}
class reactangle extends shap
{
	void draw()
	{
		System.out.println("drawing reactangle ");
	}
}
class circle extends shap
{
	void draw()
	{
		System.out.println("drawing circle ");
	}
} 
public class Main {
	public static void main(String[] args) {
   shap a=new reactangle();
   a.draw();
   a=new circle();
   a.draw();		
	}
}