package exception_pack;

public class Program7 {
	/*Write a program to generate Arithmetic Exception*/
	
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
public static void main(String arg[]) throws Exception
{
	except E1=new except();
	E1.division();
}
}
