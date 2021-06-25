package exception_pack;

import java.util.*;
/*Write a program to generate ArrayIndexOutOfBoundException*/
public class Program9 {
public static void main(String args[]) throws ArrayIndexOutOfBoundsException
{
	int x;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the Size");
	int size=s.nextInt();
	
	int array[]=new int[size];
	for(int i=0;i<array.length;i++)
		array[i]=s.nextInt();
	try
	{
	x=array[size+1];	
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println(" ArrayIndexOutOfBoundsException"+e);
	}
	
}
}
