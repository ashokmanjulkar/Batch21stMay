package methodOverHidding;

public class ClassPractice2 extends ClassPractice1
{
	public static void arithmeticOperation()
	{
		System.out.println("Subtraction");
	}
	public static void main(String[] args) 
	{
		//ClassPractice1 i=new ClassPractice1();
		ClassPractice1.arithmeticOperation();
		
		//ClassPractice2 j=new ClassPractice2();
		ClassPractice2.arithmeticOperation();
		
	}

}
