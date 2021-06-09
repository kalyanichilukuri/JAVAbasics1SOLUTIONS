package firlstjavaprogrampackage;

import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
public class Duplicate {
public static void findduplicate(int myarray[])
{
	int newarray[]=new int[myarray.length];
	newarray=myarray; int duplicatevalue=0;
	for(int i=0;i<myarray.length;i++)
	{
		for(int j=i+1;j<myarray.length;j++)
		{
	
	    if(newarray[i]==myarray[j])
	    {
	    System.out.print("duplicate value is"+newarray[j]);
	    }
		}
	}
}

	public static void main(String[] args) {
		//Write a function to find the duplicate values of an array
		Scanner in=new Scanner(System.in);
       System.out.println("enter the size of an array\n");
		int size= in.nextInt();
		int sum=0;
		 int myarray[] = new int[size];
		System.out.println("enter the array elements\n");
		for(int i=0;i<size;i++)
		{
			myarray[i]= in.nextInt();
			}
		System.out.println("array elements are "+Arrays.toString(myarray));
		findduplicate(myarray);
}
}