package demo_package;

public class Relational_Operational 

{
	public static void main(String[] args)
	
	{
	
	//comparison
	//greater than (>)
	int a=15;
	int b=12;
	boolean result= a>b;
	
	System.out.println(result);
	System.out.println("-------------------------------------------------------");

	
	//Less than (<)
	
	result=(a<b);
	
	System.out.println(result);
	System.out.println("-------------------------------------------------------");

	// Equal Equal to (==)
	
	result= a==b;
	System.out.println(result);
	System.out.println("-------------------------------------------------------");

	// Greater than and equal to (>=)
	
	result=a>=b;
	
	System.out.println(result);
	System.out.println("-------------------------------------------------------");

	// Less than and equal to (<=)
	
	result=a<=b;
	
	System.out.println(result);
	System.out.println("-------------------------------------------------------");


	// Not equal to (!=)
	
	result=(a!=b);
	
	System.out.println(result);
	System.out.println("-------------------------------------------------------");

	
	
	
	int x1=(3+5)*(5-1);   //8*4=32
	int x2=(15-7)/(21-17); // 8/4=2
	
	boolean x=x1!=x2;  //  32#2
	
	System.out.println(x);
	
	}
}