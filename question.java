class Derived
{
	public void getdetails()
	{
		System.out.println("derived class ");
	}
}
public class test extends Derived
{
	 public void getdetails()
	  {
		System.out.println("test class");
        super.getdetails();
  	 }

public static void main(String[] args) {
         Derived obj=new test();
         obj.getdetails();		
	}
}