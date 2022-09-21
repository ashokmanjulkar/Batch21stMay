package string_program;

public class String_Demo 
{
	public static void main(String[] args) 
	{
		
	
	String m="Velocity class";
	String n="Engineer";
	
	System.out.println(m);//
	
	//indexOf('')
	
	int i =m.indexOf('e');
	
	System.out.println(i);//1
	System.out.println(n.indexOf('e'));//5
	
	//lastIndexOf('')
	System.out.println(n.lastIndexOf('e'));//6
	
	//to UpperCase()
	String m5=m.toUpperCase();
	System.out.println(m5);
	
	String b5="VELOCITY ACADEMY";
	
	//toLowerCase()
	String m6=b5.toLowerCase();
	System.out.println(m6);
	//charAt(index)
	
	char j =m.charAt(4);
	System.out.println(j);//c
	
	System.out.println("_________");
	System.out.println("-----------------------------------------------------");
	
	String z="Velocity Class Katraj";
	String[] x=z.split(" ");
	//String x1=x[0];
	System.out.println(x[0]);
	System.out.println(x[1]);
	System.out.println(x[2]);
	
	//length();
	
	int k= m.length();//14
	System.out.println(k);  //length-1= last index
	
	//startsWith(" ")
	boolean p=m.startsWith("Vel");
	System.out.println(p);//true
	
	//endsWith(" ")
	boolean q= m.endsWith("class");
	System.out.println(q);//true
	
	//substring - overloaded (2)
	String subStr =m.substring(4);
	
	System.out.println(subStr);//city class
	
	String subStr2 =m.substring(4,8);     //velocity class
	
	System.out.println(subStr2);//city
	
	
	System.out.println("=========================");
	
	String m2="   Velocity class   ";
	
	//length count
	int a5=m2.length();
	System.out.println(a5);//20
	
	//trim()
	String m3=m2.trim();
	System.out.println(m2);
	System.out.println(m3);//Velocity class
	
	System.out.println("=========================");
	
	//concat  (+)
	
	String v="Velocity";
	String w=" pune";
	String v1=v+" Testing";
	System.out.println(v1);//Velocity Testing
	
	String v2=v.concat(" Katraj");
	
	System.out.println(v2);//Velocity Katraj
	
	String v3=v+w; 
	System.out.println(v3);//Velocity pune
	
	
	String v4= v.concat(w);
	System.out.println(v4);//Velocity pune
	
	}
}
