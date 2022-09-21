package all_star_pattern;

public class DownwardTriangle 
{
/*	* * * * * 
	* * * * 
	* * * 
	* * 
	* 
*/
	
	public static void main(String[] args)
	{
		for(int i=1; i<=7; i++)
		{
			for(int j=7; j>=i; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
