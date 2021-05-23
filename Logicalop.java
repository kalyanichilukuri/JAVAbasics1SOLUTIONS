package firlstjavaprogrampackage;

public class Logicalop {

	public static void main(String[] args) {
		// Programs on Logical AND,OR operator and Logical NOT
		Boolean bool_x=false,bool_y=true;
		Boolean result;
		result= bool_x|bool_y;
		System.out.println("Boolean values logical OR"+result);

		result= bool_x&bool_y;
		
		System.out.println("Boolean values logical AND"+result);

		result= !bool_x;
		
		System.out.println("Boolean values logical NOT"+result);

	}

}
