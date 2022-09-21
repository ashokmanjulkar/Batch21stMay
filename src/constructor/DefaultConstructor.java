package constructor;

public class DefaultConstructor 
{
	int a;
	int b;
	String name;
	void DefaultConstructor()
	{
		a=10;
		b=20;
		int c=a+b;
		name="Ashok";
		System.out.println(name);
		System.out.println(a);
		System.out.println(c);
	//this.name="Ashok";
	}
	public static void main(String[] args) 
	{
		DefaultConstructor b=new DefaultConstructor();
		b.DefaultConstructor();
		
	}
	

}
