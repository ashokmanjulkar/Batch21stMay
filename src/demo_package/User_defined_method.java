package demo_package;

public class User_defined_method 
{
	public static void xyz()    // User defined method
	{
		System.out.println("A");  //
		System.out.println("B");  //   Repeated code
		System.out.println("C");  //
	}
	public static void pqr()
	{
		System.out.println("k");
		System.out.println("L");
		System.out.println("M");
		System.out.println("*");
	}
	
	public static void main(String[] args)     // System defined method
	{
		pqr();
		xyz();                             // {
		System.out.println(45);            //  call defined method
		System.out.println("&");           //  }
		System.out.println(87);          
		System.out.println("#");
		xyz();
		pqr();
	}

}
