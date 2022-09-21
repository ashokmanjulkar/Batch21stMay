package demo_package;

public class Arithmatic_Operations 

{
	
	public static void main(String[] args)
	
	{
		
		//Addition Operator(+)
		
		byte a=20;   
		byte b=15;
		
		int c=a+b;        // byte operation does not run to byte and short
		
		System.out.println(c);  //ans 35
		
		System.out.println("----------------------------------------------------");

		
		
		//Subtraction Operator (-)
		float f1=41.10f;
		float f2=30.20f;
		
		float f3=f1-f2;       // float operation run only float & double
		
		System.out.println(f3);  // ans  10.899
		
		System.out.println("----------------------------------------------------");

		
		char r='R';
		
		System.out.println(r);
		
		System.out.println("----------------------------------------------------");

		
		//Multiplication (*)
		//	byte a=50;
		//  byte b=35;
		
		c=a*b;       // again int c not use only use c=a*b ------and o/p
		System.out.println(c);  // ans 300
		
		System.out.println("----------------------------------------------------");

		//Division (/)
		
		c=a/b;
		
		System.out.println(c);  // ans 1
		
		System.out.println("----------------------------------------------------");

		f3=f1/f2;    // division for fraction value //   f1=41.10f;
													//   f2=30.20f;
		
		System.out.println(f3);   // ans 1.36
		System.out.println("----------------------------------------------------");

		//Modulus(%)     means reminder
		
		int m1=35;
		int m2=3;
		
		int m=m1%m2;
		
		System.out.println(m);  // ans 2
		
		System.out.println("----------------------------------------------------");

		//Incremental operator (++)   // increment by 1
		
		int i=10;
		i++;       
		System.out.println(i++);// 11
		
		System.out.println("----------------------------------------------------");
		
		i--;  
		System.out.println(i--);
		
		System.out.println("----------------------------------------------------");

		int h=35;
		h--;
		System.out.println(h--);
		
		System.out.println("----------------------------------------------------");

		
		
		// Decrement operator (--)  // decrement bye 1
		
		int j=10;
		j--;
		
		System.out.println(j--);  // ans 9
		
		System.out.println("----------------------------------------------------");

		//Assignment Operator (=)
		//  [Variable Name]=[Value]
		
		int j1=14;
		System.out.println(j1);
		
	}
}