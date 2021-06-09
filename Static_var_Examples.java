package static_remaining_programs;

public class Static_var_Examples {

	public static int st_var1=50000, st_var2=70000;
	int instance1=1000,instance2=2000;
	public static void st_method1()
	{
		
		System.out.println("Static method1 static variable value is"+st_var1);
		st_var1+=st_var1;
		//changing the static variable value 
		
		System.out.println("Static method1  static variable value is"+st_var1);
		
		
	}
	
	public static void st_method2()
	{
		System.out.println("Static method2  static variable value is"+st_var2);
		st_var2+=st_var2;
		//changing the static variable value 
		
		System.out.println("Static method2  static variable value is"+st_var2);
		
	}
	public void in_method1()
	{
		System.out.println("Instance method1  instance1 value is "+instance1);
		//changing the instance variable value 
		instance1=100+instance1;
		System.out.println("Instance method1  instance1 value is "+instance1);
		
	}
	public void in_method2()
	{
		System.out.println("Instance method2 instance2 value is"+instance2);
		//changing the instance variable value 
		instance2=200+instance2;
		System.out.println("Instance method2 instance2 value is"+instance2);
		
	}
	
	public static void main(String arg[])
	{
		/*Write a class with 2 static variables, 2 Instance variables, 2 static methods, 2 instance
		methods and a main method.*/
		st_method1();
		st_method2();  // the in_method1 in_method2 are not static instance methods not possible to access in static methods.
		// static methods can access another static methods.
		//static methods can not access non static instance methods
		//in_method1();
		//in_method2();
	}
}
