package class_keyword;

public class KeywordDemo extends KeywordSpecial
{
	static int a=100;
	int b=200;
	
	public void test()
	{
		System.out.println(a);
		
		System.out.println(b);

		System.out.println(super.a);

		System.out.println(super.b);
	}
	
	public static void main(String[] args) 
	{
		KeywordDemo j=new KeywordDemo();
		j.test();
		
		
	}

}
