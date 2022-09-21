package methodOverRidding;

public class DemoClass2 extends DemoClass1 
{
	public void arithmeticoperation()
	{
		System.out.println("Subtraction");
	}
	public static void main(String[] args) 
	{
		DemoClass2 b=new DemoClass2();
		b.arithmeticoperation();
		
		DemoClass1 a=new DemoClass1();
		a.arithmeticoperation();
		
	}
}
