package exception_pack;
/*Write a method which throws exception, Call that method in main class without try block*/
class except
{
	static int z,x=200,y=0;
	public static void division() throws Exception
	{
		try
		{
		z=x/y;
		}
		catch (ArithmeticException e)
		{
			System.out.println("ArithmeticException"+e);
		}
	}
}
public class Program3 {
public static void main(String arg[]) throws Exception
{
	except E1=new except();
	E1.division();
}
}
