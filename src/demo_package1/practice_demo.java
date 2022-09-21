package demo_package1;

public class practice_demo 
{
	public static void main(String[] args)
	
	{
		int marks=65;
		if (marks>=76)
		{
			System.out.println("science");
			if (marks>=90)
			{
				System.out.println("Division A");
			}
			else if (marks>=80)
			{
			System.out.println("Division B");	
			}
			else
			{
				System.out.println("Division C");
			}
		}
		else if (marks>=60)
		{
			System.out.println("Commerce");
			if (marks>=70)
			{
				System.out.println("Division A");
			}
			else if(marks>=65)
			{
				System.out.println("Division B");
			}
			else
			{
				System.out.println("Division C");
			}
		}
		else if (marks>=35)
		{
			System.out.println("arts");
			if (marks>=50)
			{
				System.out.println("Division A");
			}
			else if (marks>=40)
			{
				System.out.println("Division B");
			}
			else
			{
				System.out.println("Division C");

			}
		}
		else
		{
			System.out.println("Not Capable");

		}
		
		
	}
	
}