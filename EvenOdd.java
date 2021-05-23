package firlstjavaprogrampackage;

public class EvenOdd {

	public static void main(String[] args) {
		// Write a program to print the odd and even numbers.
		Integer range=20;
		for(int i=1;i<=20;i++)
		{ 
	       if(i%2==0)		
			System.out.println("even number is "+i);
		}
		for(int i=1;i<=20;i++)
		{
		if(i%2!=0)
	    	   System.out.println("odd number is "+i);
		}
	}

}
