import java.util.*;
class Rectangles
{
	public int Area(int x,int y)
	{
		return x*y;
	}
}
public class Main {
	public static void main(String[] args) {
	   Rectangles r1=new Rectangles();
	   Rectangles r2=new Rectangles(); 	       System.out.println("area of Rectangles="+(r1.Area(4,5)));
	   System.out.println("area of   Rectangles="+(r2.Area(5,8)));
	}
}