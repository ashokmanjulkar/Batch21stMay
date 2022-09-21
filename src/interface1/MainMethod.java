package interface1;

public class MainMethod 
{
	public static void main(String[] args) 
	{
		// object create
		DemoA h=new DemoA();
		h.demo();
		
		// calling
		System.out.println(DemoA.r);
		System.out.println(h.r);
		System.out.println(NewIterface.r);
		
	}

}
