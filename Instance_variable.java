package inherit_classes;
/* Create a class with PRIVATE fields, private method and a main method. Print the fields
in main method. Call the private method in main method.*/


// not possible to access private methods and private variable in another classes
class Private_class
{
	private int pri_var1,pri_var2;
	private void method(int x, int y)
	{
		pri_var1=x; pri_var2=y;
		System.out.println("Private method of private class"+pri_var1+pri_var2);
	}
}
/*class b extends Private_class
{
	void method1()
	{
	System.out.println("value of private values"+pri_var1+pri_var2);
	}
}*/
public class Instance_variable {

	public static void main(String[] args) {
		Private_class pvtobj= new Private_class();
		// not possible to access private variable and private methods of a class to another class
		//pvtobj.method(100,200);
		/* Create a class with PRIVATE fields, private method and a main method. Print the fields
		in main method. Call the private method in main method.*/

	}

}
