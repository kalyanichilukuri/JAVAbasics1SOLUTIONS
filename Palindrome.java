package firlstjavaprogrampackage;

public class Palindrome {

	public static void main(String[] args) {
		// Write a program to palindrome or not
		int orginal=121,orgnum1;
		float res=0,rem=0;
		int orgnum=orginal;
		while(orgnum!=0)
		{
			res=res*10+orgnum%10;
		
			orgnum=orgnum/10;
			
			
		}
		
if(orginal==res)
	System.out.println("Palindrome");
else
	System.out.println("not a Palindrome");
	}

}
