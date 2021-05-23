package firlstjavaprogrampackage;

public class Large10_20_30 {

	public static void main(String[] args) {
		// Write a program to print largest number among three numbers.
		Integer x=10,y=20,z=30;
		if(x>y&&x>z)
		{
		    	System.out.println("this number is bigger among three numbers"+x);
		}
		else if(y>x&&y>z)
		{
	    	System.out.println("this number is bigger among three numbers"+y);
		}
	    else if(z>x&&z>y)
	    {
		System.out.println("this number is bigger among three numbers"+z);	
    	}			
}
}