package demo_package;

public class logical_Operator 
{

	public static void main(String[] args) 
	
	{
		// AND LOGIC (&&)
		// T&&T ----=T
		// T&&F ----=F
		// F&&T ----=F
		// F&&F ----=F

		boolean a=true;
		boolean b=false;
				
		boolean c= a && b;
		System.out.println(c);
		
		System.out.println("-------------------------------------------------------");
		

		boolean r=(5>3)&&(8<11);
		
		System.out.println(r);
		
		System.out.println("-------------------------------------------------------");

		
		// OR LOGIC (||)
		// T||T ----=T
		// T||F ----=T
		// F||T ----=T
		// F||F ----=F

		
		c= a||b;
		System.out.println(c);
		
		System.out.println("-------------------------------------------------------");

		
		// NOR LOGIC  (!=)

		c=a!=b;
		System.out.println(c);
		
		System.out.println("-------------------------------------------------------");

		
		
		int x1=10;
		int x2=12;
		//               (10>=12)&&(10<=12)
		//                F    &&    T           ANS is F
		boolean result=(x1>=x2)&&(x1<=x2);
		
		System.out.println(result);
		
		System.out.println("-------------------------------------------------------");

		
		result=(x1!=x2)||(x2>=x1);
		
		System.out.println(result);

	}

}
