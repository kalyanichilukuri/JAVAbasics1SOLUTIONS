package firlstjavaprogrampackage;

public class PrintNumbers10To100 {

	public static void main(String[] args) {
		// Write a program to print even number between 10 and 100 using while
		int i=10;
		System.out.println("Even numbers are "+ "   ");
		
		while(i<=100)
		{
			float  res=i%2;
			if(res==0)
			System.out.print(i+ "  ");
		++i;
		}
}
}