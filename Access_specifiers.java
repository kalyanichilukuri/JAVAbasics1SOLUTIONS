package package1_access;
class Protected_class_spec
{
	protected int x,y;
	protected void method_prote()
	{
		System.out.println("method protected "+x+y);
	}
}

public class Access_specifiers {

	public static void main(String[] args) {
Protected_class_spec obj=new Protected_class_spec();
obj.x=100;
obj.y=200;
obj.method_prote();
		/*Create a class with PROTECTED fields and methods. Access these fields and methods
		from any other class in the same package.
		Also, Access the PROTECTED fields and methods from child class located in a different
		package
		Access the PROTECTED fields and methods from any class in different package*/
// Not possible to access protected fields and methods from child class in a different package 
//not possible Access the PROTECTED fields and methods from any class in different package*/
	}

}
