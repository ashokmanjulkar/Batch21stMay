package practiceQuestions;

import java.util.Scanner;

public class Fibonacci_Number 
{
	public static void main(String[] args)
	{
		int f=1, n, s=1, t;
		Scanner a=new Scanner(System.in); //???
		System.out.println("Enter Number");
		n=a.nextInt();//???
		a.close();//???
		System.out.println(f);//1
		System.out.println(s);//1
		for(int i=3; i<=n; i++)//3<=8==T, 4<=8==T, 5<=8==T, 6<=8==T, 7<=8, 8<=8==T, 9<=8==F
		{
			t=f+s;//2=1+1, 3=1+2, 5=2+3, 8=3+5, 13=5+8, 21=8+13
			System.out.println(t);//2,3,5,8,13,21
			f=s;//1,2,3,5,8,13
			s=t;//2,3,5,8,13,21
		}
	}
}
