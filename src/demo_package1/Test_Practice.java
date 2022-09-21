package demo_package1;

public class Test_Practice 
{
	public static void main(String[] args)
	{
		int a,b,c;
		
		for(a=1; a<=5; a++)
		{
			for(b=1; b<=a; b++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(a=1; a<=4; a++ )
		{
			for(b=4; b>=a; b--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------------------------------------------------");

		for(a=1; a<=5; a++)
		{
			for(b=5; b>a; b--)
			{
				System.out.print(" ");
			}
			for(c=1; c<=a; c++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
			int i,j,k;
			for(i=1; i<5; i++)  //1<=5
			{
				for(j=1; j<=i; j++)  //1<=1
				{
				System.out.print(" ");
				}
			for(k=5; k>i; k--) //4>1
				{
					System.out.print("*");
				}
			System.out.println();
			}
		}
	}

