package static_remaining_programs;

public class Splitting_string {

	public static void main(String[] args) {
		// Splitting strings with split()
		String st1="welcome to java programming";
		String[] split_string=st1.split("\\s");
		System.out.println("after replacing the string");
		for (String x:split_string)
        System.out.println(x);
	}

}
