package firlstjavaprogrampackage;
class MethodClass // creating a class
{
	public void method(int x,int y) // method signature
    { 
    	System.out.println("Addition is"+(x+y));
    }
	
}
public class Createclass 
{
   
	public static void main(String[] args) {
		
		// creating object
		MethodClass method_obj= new MethodClass();
		method_obj.method(4, 5);// calling the method
	}

}
