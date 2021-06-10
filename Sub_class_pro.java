package inherit_classes;
class Private_class1
{
	private int pri_var1,pri_var2;
	private void method(int x, int y)
	{
		pri_var1=x; pri_var2=y;
		System.out.println("Private method of private class"+pri_var1+pri_var2);
	}
}
class B1 extends Private_class1
{
	void method1()
	{
		// not possible to access private variable and private methods in subclass 

	//System.out.println("value of private values"+pri_var1+pri_var2);
	}
}
public class Sub_class_pro {

	public static void main(String[] args) {
		// Create a sub class and try to access the private fields and methods from sub class

		// not possible to access private variable and private methods in subclass 
	}

}