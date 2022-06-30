class six
{
	public static void main(String [] args)
	{
		int a,b,c;
		char op;
		a=12;
		b=34;
		op='+';
		switch(op)
		{
			case '+':
			c=a+b;
			System.out.println("result=>"+c);
			break;
			case '-':
			c=a-b;
	       			System.out.println("result=>"+c);
	       			break;
	       case '/':
	       c=a/b;
	       			System.out.println("result=>"+c);
	       break;
	       case '*':
	       c=a*b;
	       			System.out.println("result=>"+c);
	      break;
	      case '%':
	      c=a%b;
	      			System.out.println("result=>"+c);
	      			break;
	      			default:
	      						System.out.println("worng operator");
	    break;      					
		}
	}
}