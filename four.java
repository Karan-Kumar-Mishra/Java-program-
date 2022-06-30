class four
{
	public static void main(String[] args)
	{
		int a,b,c,max;
		a=10;
		b=20;
		c=30;
		if(a>b)
		{
			if(a>c)
			{
				max=a;
			}
			else
			{
				max=c;
			}
		}
		else
		{
			if(b>c)
			{
				max=b;
			}
			else
			{
				max=c;
			}
		} 
		System.out.println("max="+c);
	}
}