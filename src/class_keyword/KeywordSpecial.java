package class_keyword;

public class KeywordSpecial 
{
	static int a=10;
	int b=20;
	
	public void demo()
	{
		int a=50;
		int b=70;
		int add=a+40;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(b);
		System.out.println(this.b);
		System.out.println(add);

	}
	
	public static void main(String [] args)
	{
		KeywordSpecial i= new KeywordSpecial();
		i.demo();
	}

}
