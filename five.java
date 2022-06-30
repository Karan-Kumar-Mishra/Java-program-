class five
{
	public static void main(String[] args)
	{
		int a,b,c,max;
		a=10;
		b=20;
		c=30;
		if(a>=b && a>=c)
		{
			max=a;
		}
		else if(b>=c)
		{
			max=b;
		}
		else
		{
			max=c;
		}
		System.out.println("max="+max);
	}
}