package firlstjavaprogrampackage;

public class Switch {
public static void main(String arg[])
{
	//Program to check whether a number is EVEN or ODD using switch
	int num=123;
	
	switch(num%2)
	{
	case 1: System.out.println("Odd number "); break;
	case 0: System.out.println("Even number"); break;
	}
}
}
