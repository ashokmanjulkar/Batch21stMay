package encapsulation;

public class ClassB {
	
	public static void main(String [] args)
	{
		//ClassA.addition();
		String a=ClassA.returnUserName();
		String b=ClassA.returnPassword();
		
		System.out.println(a);
		System.out.println(b);
	}
}
