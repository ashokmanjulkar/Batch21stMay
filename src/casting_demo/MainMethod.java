package casting_demo;

public class MainMethod 
{
	public static void main(String[] args) 
	{
		
	SuperClass a = new SuperClass();
	a.arithmaticOperation();
	a.demo();
	
	SubClass b = new SubClass();
	b.arithmaticOperation();
	b.demo();
	
	SuperClass cast=new SubClass();
	cast.arithmaticOperation();
	cast.demo();
	
	
	}
}