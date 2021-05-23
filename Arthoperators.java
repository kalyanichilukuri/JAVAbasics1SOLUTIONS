package firlstjavaprogrampackage;

public class Arthoperators {
	public static void main(String arg[])
	{
	/* Programm Write a function for arithmetic operators(+,-,*,/)*/
		Integer intvalue1=100,intvalue2=200;
		
		float floatvalue1=200.10f,floatvalue2=50.2f;
	    
		Integer intmulvalue1=5,intmulvalue2=10;
	    
		Integer intremvalue1=45,intremvalue2=11;
	
	    System.out.println("Integer arthmetic addition is"+intvalue1+ " + "+ intvalue2+" = "+ (intvalue1+intvalue2));
		
	    System.out.println("FLoat arthmetic subtration is "+floatvalue1+ "-" + floatvalue2+ "=" + (floatvalue1-floatvalue2));
		
	    System.out.println("Intger multiplication result is  "+intmulvalue1 + "*"+ intmulvalue2 +"="+(intmulvalue1*intmulvalue2));
		
	    System.out.println("Intger remainder result is  "+intremvalue1 + "%"+ intremvalue2 +"="+(intremvalue1%intremvalue2));
		
	}
}
