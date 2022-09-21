package demo_package;

public class Nested_If_Else
{
	public static void main(String[] args)
	{
		int a=150;
		int b=100;
		int c=250;
		
		if (a>b)
		{
			if (a>c)
				{
				System.out.println("a is greater = " + a);
				}
				
				else
					{
					System.out.println("c is greater = " + c);
					}
			
			}
		else 
			{
				if (b>c)
					{
					System.out.println("b is greater = " + b);
					}	
					else
						{
						System.out.println("c is greater = " + c);
						}
			}
		}
			
	}
