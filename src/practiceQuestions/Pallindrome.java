package practiceQuestions;

public class Pallindrome 
{
	public static void main(String[] args)
	{
		int n=121, temp=n,r,sum=0;
		while(n>0)//121,12,1
		{
			r=n%10;//1,2,1
			sum=(sum*10)+r;//1,12,121
			n=n/10;//12,1,0
		}
		if(sum==temp)
		{
			System.out.println("given number is pallindrome" +temp);
		}
		else
		{
			System.out.println("given number is not pallindrome" +temp);
		}
	}

}
