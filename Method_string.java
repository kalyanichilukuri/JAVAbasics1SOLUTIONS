package static_remaining_programs;

public class Method_string {

	public static void main(String[] args) {
		// equalsIgnoreCase(), startsWith(), endsWith() and compareTo()
		String st1="welcome to java programming";
		String st2="Welcome to Java Programming";
		String st3="java";
		if(st1.equalsIgnoreCase(st2))
		{
			System.out.println("Both the string are equals upper and lower case are treated as same");
		}
      boolean boolval=st1.startsWith("wel");
      System.out.println("string1 starts with the given character "+ boolval);
      Boolean boolval1=st1.endsWith("ing");
      System.out.println("string1 starts with the given character "+ boolval);
      int compare_result= st1.compareTo(st3);
      System.out.println("compare_result"+compare_result);
	}
}
