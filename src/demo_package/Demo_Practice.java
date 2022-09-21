package demo_package;

public class Demo_Practice 
{
	public static void main(String [] args)
	
	{
		int a=20;
		
		if (a<10)
			
		{
			System.out.println("Statement is True");
			
	
		}
		
		else
			
		{
			System.out.println("Statement is false");
			System.out.println("-------------------------------------------------");
		}
		
		
		// 2nd condition
		int amount=10000;    //
		
		if (amount >=100000)	
		{
			System.out.println("four Wheeler");
		}
		
		
			else if (amount >= 80000)
			{
				System.out.println("Two wheeler");	
			}
		
			else if (amount >= 50000)
			{
				System.out.println("Scooty");
				
			}
		
			else 
				
			{
				System.out.println("save environment");
				
				System.out.println("---------------------------------------------");
			}
		
		
		// 3rd condition
		int r=20;
		int b=20;
		
		if (r < b)
			{
			System.out.println("a less than b");
			}
		else if (r <= b)
			{
			System.out.println("a less than or equal to b");
			}
		
		else if (r > b)
			{
			System.out.println("a greater than b");
			}
		
		else if (r >= b)
			{
			System.out.println("a greater than or equal to b");
			}
		
		else if (r == b)
			{
			System.out.println("a equal to b");
			}
		
		else if (r != b)
			{
			System.out.println("a not equal to b");
			}
	}
}