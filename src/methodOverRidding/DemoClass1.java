package methodOverRidding;

public class DemoClass1 
{
	// non static operation only----> Advantages and memory save 
	public void arithmeticoperation()
	{
		System.out.println("Addition");
	}
	public static void main(String[] args) 
	{
		DemoClass1 a=new DemoClass1();
		a.arithmeticoperation();
	}

}
