package encapsulation;

public class ClassA {
	
	private static int a=20;
	private static int b=30;
	
	private static String userName="Velocity";
	private static String password="Velocity@21May";
	
	public static void addition()
	{
		System.out.println(a);
		System.out.println(b);
		int c=a+b;
		System.out.println(c);
	}
	
	public static String returnUserName()
	{
		return userName;
	}
	public static String returnPassword()
	{
		return password;
	}
	
	

}
