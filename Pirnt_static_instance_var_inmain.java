package static_remaining_programs;

public class Pirnt_static_instance_var_inmain {
	public static int st_var1=50000, st_var2=70000;
	int instance1=1000,instance2=2000;
	
	public static void main(String[] args) {
		//Print all the static, instance variables in main method
	System.out.println("value of static variables"+st_var1+ "  "+st_var2);
	// not possoble to access the non static instance variables in static methods
	//System.out.println("value of instance variables"+instance1+ " "+instance2);
	}

}
