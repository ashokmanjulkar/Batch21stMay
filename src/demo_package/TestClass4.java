package demo_package;

public class TestClass4 
{
	public static void main(String[] args)
	{
		int a=10;
		int b=50;
		int c=65;
		int d=5;
		
		if (a>b)
		{
			if (a>c)
			{
				if (a>d)
				{
				System.out.println("a is greater = " + a);
				}
			else
				{
				System.out.println("d is greater = " + d);
				}
			}
			else if(c>d)
			{
				System.out.println("c is greater = " + c);
			}
			else
			{
				System.out.println("d is greater = " + d);
			}
		}
		else if (b>c)
			{
				if (b>d)
				{
				System.out.println("b is greater = " + b);
				}
				else
				{
				System.out.println("d is greater = " + d);
				}
			}
			else if (c>d)
				{
				System.out.println("c is greater = " + c); 
				                                                         
				}                                                    
			else
				{
				System.out.println("d is greater = " + d);
				}	
	}
}