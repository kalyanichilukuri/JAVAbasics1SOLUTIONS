package package2_aceess;
import package1_access.*; // 
class prote_Access_class 
{
public int x=700,y=200;
public void method()
{
	System.out.println("value of x and y"+x+y);
}
}
public class Accessing_protec_data_from_package1 {

	public static void main(String[] args) {
		/* Create a class with PUBLIC fields and methods.
		Access the public methods and fields from any class in the same package or different
		package*/
		prote_Access_class obj=new prote_Access_class();
		obj.method();
		
	}

}
