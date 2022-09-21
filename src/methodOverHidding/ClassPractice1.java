package methodOverHidding;

public class ClassPractice1 
{
	// static operation only-------> Disadavntages and memory not save
	
	public static void arithmeticOperation()
	{
		System.out.println("Addition");
	}
	public static void main(String[] args) 
	{
		//ClassPractice1 i=new ClassPractice1();
		 ClassPractice1.arithmeticOperation();
	}
}
