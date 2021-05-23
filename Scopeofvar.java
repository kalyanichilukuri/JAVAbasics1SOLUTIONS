package firlstjavaprogrampackage;

public class Scopeofvar {
	public static int var=1000;
	public static void main(String[] args) {
		/* Define the local and Global variables with the same name and print both variables and
		understand the scope of the variables*/
		System.out.println("global varialbe value is "+var);
		Boolean boolvar=true;
		if(boolvar)
		{ 
			int var=2000;
			System.out.println("local variable value "+var);
			boolvar=false;
		}
		System.out.println("global value remains unchanged "+ var);
		/* is global varible value but not if loop variable*/ 
	}

}
