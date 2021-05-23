package firlstjavaprogrampackage;

public class Relop {

	public static void main(String arg[])
		{
		
		/* Program for relational operators (<,<==, >, >==)*/
		Integer intvalue1=200,intvalue2=300;
		Integer result_x1=400,result_x2=100;
		if(intvalue1<intvalue2)
			System.out.println("intger values "+intvalue1+ "is less than the  "+intvalue2);
		if(intvalue2>intvalue1)
			System.out.println("intger values "+intvalue2+ "is greater than the  "+intvalue1);
		if(intvalue1<=result_x1)
			System.out.println("intger values "+intvalue1+ "is less  or equal to the  "+result_x1);
		if(intvalue2>=result_x2)
			System.out.println("intger values "+intvalue2+ "is greater than  or equal to the  "+result_x2);
		
		}

}