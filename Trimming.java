package static_remaining_programs;
import java.lang.String.*;
public class Trimming {
	
	// Trimming strings with trim() 
	// whit spaces are removed
	public static void main(String[] args) {
	
		String st1="     welcome to java programming     ";
		String trimmingstring;
		trimmingstring= st1.trim()+"thank you";
		System.out.println("Before trimming"+st1+"thank you");
        System.out.println("After trimming"+trimmingstring);
	}

}
