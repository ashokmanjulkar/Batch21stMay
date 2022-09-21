package iterface_A1;

public interface TestInter 
{
	//public interface TestInter
	
		int r=50;
		void test();
		
		public static void demo()
		{
			System.out.println("Static method of interface");
		}
		
		public default void defaultMethod()
		{
			System.out.println("Default method of Interface");
		}

}
