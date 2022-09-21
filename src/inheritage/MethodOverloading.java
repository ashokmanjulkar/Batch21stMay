package inheritage;

public class MethodOverloading 
{
	public static void addition(int a,int b)//parameter or argument
	{
		int c=a+b;
		System.out.println(c);
	}
	public static void addition(int a, int b, int c)
	{
		int d=a+b+c;
		System.out.println(d);
	}
	public static void addition(int a,char c)
	{
		System.out.println(a);
		System.out.println(c);
	}
	public void addition()
	{
		System.out.println("Non Static Method");
	}
	public static void main(String[] args) 
	{
		addition(14,16);
		addition(11,12,13);
		addition(4,'f');
		MethodOverloading n=new MethodOverloading();  // Object creation/creat
		n.addition();  // method is call with the help of object
	}

}
