package exception_pack;

public class Program17StringIndexOutOfBounds {
		   public static void main(String[] args) {
		      String str = "Welcome to ITBRIGHT CAREER.";
		      try {
		        // StringIndexOutOfBoundsException will be thrown because str only has a length of 27.
		str.charAt(28);
		         System.out.println("String Index is valid");
		      } catch (StringIndexOutOfBoundsException e) {
		         System.out.println("String Index is out of bounds");
		      }
		   }
		}