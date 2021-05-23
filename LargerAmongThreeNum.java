package firlstjavaprogrampackage;

public class LargerAmongThreeNum {

	public static void main(String[] args) {
		// Write a program to print largest number among three numbers.
		double dvalue=2000.3232,dvalue2=3324.53,dvalue3=32.4;
		if(dvalue>dvalue2&&dvalue>dvalue3)
		{
		    	System.out.println("this number is bigger among three numbers"+dvalue);
		}
		else if(dvalue2>dvalue&&dvalue2>dvalue3)
		{
	    	System.out.println("this number is bigger among three numbers"+dvalue2);
		}
	    else if(dvalue3>dvalue&&dvalue>dvalue2)
	    {
		System.out.println("this number is bigger among three numbers"+dvalue3);	
    	}			
}
}