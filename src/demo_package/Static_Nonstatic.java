package demo_package;

public class Static_Nonstatic
{
	static int a=45;
	int b=35;
	
	static void staticMethod()
	{
		System.out.println("Static Method of Class of Static_Nonstatic");
	}
	
	void nonStaticMethod()
	{
		System.out.println("Non-Static Method of Class of Static_Nonstatic");
	}
	public static void main(String[] args) 
	{
		System.out.println(a);
		staticMethod();
		
		Static_Nonstatic p= new Static_Nonstatic();
		System.out.println(p.b);
		p.nonStaticMethod();
	}
	}
