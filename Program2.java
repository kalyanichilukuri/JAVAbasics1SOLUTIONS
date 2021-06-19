package exception_pack;
import java.lang.Throwable.*;

/*Handle the Arithmetic exception using try-catch block*/
public class Program2 
{
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
