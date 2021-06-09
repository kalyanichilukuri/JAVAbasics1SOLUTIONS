package static_remaining_programs;

public class Print_nonstatic_var_in_instancemethods {

	public int st_var1=50000, st_var2=70000;
	public static void instance_method1()
	{
		// not possible to print the static variable in non static instance variable.
		//System.out.println("Static method1 static variable value is"+st_var1;
		
	}
	
	public static void main(String[] args) {
		// Print static variables in Instance methods
	}// not possible to print the static variable in non static instance variable.
	
	//similarly not possible to Call instance methods in static methods
	
	//not possible to Call static methods in instance methods

}
