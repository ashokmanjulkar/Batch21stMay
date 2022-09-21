package inheritance;

public class ClassR extends ClassQ
{
	int z=25;
	public static void main(String[] args) 
	{
		ClassR c=new ClassR();
		System.out.println(c.z);
		System.out.println(c.x);
		System.out.println(c.y);
	}
}
