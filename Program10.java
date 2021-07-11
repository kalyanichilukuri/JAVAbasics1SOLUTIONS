package exception_pack;

/*Write a program to generate ClassNotFoundException*/
public class Program10 {

	public static void main(String[] args) throws Exception{
		
			    try {
			      Class.forName("exception_pack.MyInvisibleClass");
			      ClassLoader.getSystemClassLoader().loadClass("exception_pack.MyInvisibleClass");
			    } catch (ClassNotFoundException e) {
			     // e.printStackTrace();
			      System.out.println("class not found exception"+e);
			    }
			  }
}