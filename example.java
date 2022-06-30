package pack1;
import pack2.student;
public class example
{
	public static void main(String []args)
	{
		student s1=new student();
		s1.setroll(10);
		s1.setname("mishar");
		System.out.println("roll no: "+s1.getroll());
      System.out.println("name : "+s1.getname());
		}
}