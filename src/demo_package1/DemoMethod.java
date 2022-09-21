package demo_package1;

public class DemoMethod 
{
	public static void addition(int x, int y)
	{
		int c=x+y;
		System.out.println(c);
	}
	public static void subtraction (int x, int y, int z)
	{
		int c=x-y-z;
		System.out.println(c);
	}
	public static void main(String[] args) 
	{
		addition(45,15);
		subtraction(30,20,10);
		
	}

}
