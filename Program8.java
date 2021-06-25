package exception_pack;
/*Write a program with finally block*/
public class Program8 {
		public static void main(String arg[]) throws ArithmeticException 
		{
			int x=20,y=0,z;
			try
			{
				z=x/y;
			}
			catch(ArithmeticException e)
			{
				System.out.println("Arithemetic exception"+e);
			}
			finally
			{
				System.out.println("optional");
			}
	}
}