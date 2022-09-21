package demo_package;

public class For_loop 
{
	public static void main(String[] args)
	{
		int a;
		int z=10;
		
		for (a=1; a<=5; a++)
		{
			System.out.println(z);
		}
		System.out.println("------------------------------------");

		int b;
		for (b=1; b<=5; b++)
		{
			System.out.println("b");
		}
 
		System.out.println("------------------------------------");

		int c;
		
		for (c=10; c>0; c--)
		{
			System.out.println(c);
		}	
		System.out.println("------------------------------------");

		
		int d;
		
		for (d=0; d<5; d++)
		{
			System.out.println(d);
		}
		
		System.out.println("------------------------------------");

		for (int e=1; e<=5; e++)
		{
			for(int f=5; f>=e; f--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------------------------------");

		for (int h=1; h<=5; h++)
		{
			for(int g=0; g<h; g++)
			{
				System.out.print("*");
			}
			System.out.println();

		}
		System.out.println("------------------------------------");
		
		for (int i=1; i<6; i++)
		{
			for(int j=1; j<i; j++)
			{
				System.out.print(" ");
			}
			for (int k=6; k>i; k--)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		System.out.println("------------------------------------");
		
		for (int l=1; l<6; l++)
		{
			for(int m=5; m>l; m--)
			{
				System.out.print(" ");
			}
			for (int n=0; n<l; n++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		System.out.println("------------------------------------");

		
		for (int o=1; o<6; o++)
		{
			for(int p=5; p>o; p--)
			{
				System.out.print(" ");
			}
			for (int q=0; q<o; q++)
			{
				System.out.print("* ");   // only add star after/before space
			}
			System.out.println(" ");
		}
		System.out.println("------------------------------------");
		
		for (int r=1; r<6; r++)
		{
			for(int s=1; s<r; s++)
			{
				System.out.print(" ");
			}
			for (int t=6; t>r; t--)
			{
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		System.out.println("------------------------------------");

		
		for(int u=1; u<7; u++)
		{
			for(int v=7; v>u; v--)
			{
				System.out.print(" ");
			}
			for(int w=0; w<u; w++)
			{
				System.out.print("* ");
			}
			System.out.println( );
		}
		for (int r1=1; r1<7; r1++)
		{
			for(int s1=1; s1<=r1; s1++)
			{
				System.out.print(" ");
			}
			for (int t1=6; t1>r1; t1--)
			{
				System.out.print(" *");
			}
			System.out.println( );
		}
		System.out.println("----------------------------------------------------");
		
		for(int a1=1; a1<7; a1++)
		{
			for(int b1=7; b1>a1; b1--)
			{
				System.out.print(" ");
			}
			for(int c1=1; c1<=(2*a1-1); c1++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		System.out.println("inverted equilateral tringle ");
	
		for(int d1=1; d1<9; d1++)//1<7
		{
			for(int e1=1; e1<d1; e1++)
			{
				System.out.print(" ");
			}
			for(int f1=9; f1>=(2*d1-1); f1--)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		System.out.println("------------------------------------------------------");
		
		for(int a2=1; a2<7; a2++)
		{
			for(int b2=7; b2>a2; b2--)
			{
				System.out.print(" ");
			}
			for(int c2=1; c2<=(2*a2-1); c2++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		for(int d2=1; d2<9; d2++)
		{
			for(int e2=0; e2<=d2; e2++)
			{
				System.out.print(" ");
			}
			for(int f2=9; f2>=(2*d2-1); f2--)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		System.out.println("------------------------------------------------------");

		
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
		
		System.out.println("----------------------------------------------------");
		
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