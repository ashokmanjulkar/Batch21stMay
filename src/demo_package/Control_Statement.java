package demo_package;

public class Control_Statement 

{
	public static void main(String[] args)
	
	{
		int a=10;
				
		if (a>=10)
		   {
			System.out.println("a is greater than or equal to 10");
			}
		
		else
			{
			System.out.println("a is smaller than or equal to 10");
			}
		
		
		//
		int b=10;
		
		if (b!=10)
			{
			System.out.println("b is not equal to 10");
			}
		
		else
			{
			System.out.println("b is equal to 10");
			}
		
		//
		int marks=30;
		
		if (marks>75)
			{
			System.out.println("Take Addmission Sci");
			}
		
		else if(marks>=60)
			{
			System.out.println("Take Addmission Commerce");
			}
		
		else if (marks>=35)
			
			{
			System.out.println("Take Addmission Art");
			}
		
		else
			{
			System.out.println("You are Failed");
			}
		
	}

}
