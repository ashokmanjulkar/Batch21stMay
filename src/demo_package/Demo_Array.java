package demo_package;

public class Demo_Array 
{
	public static void main(String[] args)
	{
		// datatype [] variableName= {v1, v2, v3,.....,vn};
		// datatype variableName [] ={v1, v2, v3,.....,vn};
		// Array declaration & initialization at same time
		int a[]= {10,20,30,40,50,60,70,80,90,12,45};
		int size =a.length;
		
		for (int i=0; i<size; i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("-------------------------------------------------");

		char [] b= {'a','b','c','d','e','f'};
		for (int i=0; i<b.length; i++)
		{
			System.out.println(b[i]);
		}
		System.out.println("-------------------------------------------------");

		String [] name= {"velocity", "class", "package", "testing"};
		System.out.println(name[2]);
		System.out.println("-------------------------------------------------");
		
		//DataType [] VariableName= new DataType[size];
		// Array Declaration & initialization separately
		int p[] =new int[4];
		p[0]=11;
		p[1]=22;
		p[2]=33;
		p[3]=44;
		
		System.out.println(p[1]);	
	}

}
