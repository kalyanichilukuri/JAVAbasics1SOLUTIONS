package exception_pack;
/*Write a program with multiple catch blocks*/
public class Program4 {

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
		catch(Exception e)
		{
			System.out.println("Exception"+e);
			
		}
	}
	public static void main(String[] args) throws Exception{
		except E1=new except();
		E1.division();
	}
}
