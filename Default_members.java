package inherit_classes;

 class Default_class
{
	int x,y;
	void method()
	{
		System.out.println("method of Default class");
	}
}
public class Default_members {

	public static void main(String[] args) {
		Default_class obj=new Default_class();
		obj.method();
		/* Create a class with DEFAULT fields and methods. Access these fields and methods
		from any other class in the same package*/

	}

}
