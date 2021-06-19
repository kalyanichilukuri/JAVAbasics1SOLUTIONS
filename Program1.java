package exception_pack;
/*Write a program to generate Arithmetic Exception without exception handling*/
/*not possible to catch the Arithmetic Exception without exception handling*/
public class Program1 {
public int x=2,y=0,z;
public void div()  
{
	z=x/y;
	System.out.println("Arithemetic exception");
}
	public static void main(String arg[])
	{
		Program1 obj=new Program1();
		obj.div();
	}
}
/*Error Exception in thread "main" java.lang.ArithmeticException: / by zero
	at exceptions/exception_pack.Program1.div(Program1.java:8)
	at exceptions/exception_pack.Program1.main(Program1.java:14)
*/