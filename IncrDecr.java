package firlstjavaprogrampackage;

public class IncrDecr {
public static void main(String arg[])
{
	/*Write a method for increment and decrement operators(++, --)*/
	int incr_x=10,incr_x_result;

	int decr_y=100,decr_y_result;
	//post increment value 
	incr_x_result=incr_x++;
	System.out.println("post increment"+incr_x_result);
	System.out.println("value of x value after post increment"+incr_x);
	 
	//pre increment
	System.out.println("value of x before pre increment"+incr_x);
	incr_x_result=++incr_x;
	System.out.println("pre increment"+incr_x_result);
	System.out.println("value of x value after pre increment\n\n\n"+incr_x);

/*Decrement y value*/
	
	decr_y_result=decr_y--;
	System.out.println("post decrement"+decr_y_result);
	System.out.println("value of x value after post decrement"+decr_y);
	 
	//pre increment
	System.out.println("value of x before pre decrement"+decr_y);
	decr_y_result=--decr_y;
	System.out.println("pre decrement"+decr_y_result);
	System.out.println("value of x value after pre decrement"+decr_y);

}
}
