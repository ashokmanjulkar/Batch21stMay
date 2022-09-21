package casting_demo;

public class PrimitiveCasting 
{
	public static void main(String[] args) 
	{
	
	byte a=127;
	short b=a;
	System.out.println(b);
	
	short c=130;
	byte d=(byte)c;
	System.out.println(d);
	
	int e=10;
	short f = (short) e;
	System.out.println(f);
	}

}
