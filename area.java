import java.util.*;
class shap
{
	static void area(float r)
	{
		float area=3.14f*r*r;
		System.out.println("area of cicle = "+area);
	}
	static void area(int l,int b)
	{
		int area=l*b;
		System.out.println("area of rectangle ="+area);
	}
	static void area(int s)
	{
		int area=s*s;
		System.out.println("area of rectangle ="+area);
	}
}
public class Main {
	public static void main(String[] args) {
		shap.area(10);
        shap.area(5,8);
        shap.area(3.5f);		
	}
}