package iterface_A1;

public class Test3 
{
	public static void main(String[] args)
	{
		Test2 obj=new Test2();
		obj.test();
		System.out.println(obj.r);
		System.out.println(Test2.r);
		System.out.println(TestInter.r);
	}

}
