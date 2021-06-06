package firlstjavaprogrampackage;
import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
public class CommonValuesArray {
	public static void Commonelement(int myarray[],int myarrayanother[])
	{ int flag=0;
		for(int i=0;i<myarray.length;i++)
		{
			for(int j=0;j<myarray.length;j++)
			{
		
		    if(myarrayanother[i]==myarray[j]||flag>0)
		    {
		    	flag++;
		    System.out.print("common element"+myarrayanother[j]);
		    }
		    }
		}
		if(flag==0)
	    	System.out.print("no common element");
		
	}

	public static void main(String[] args) {
		// Write a program to find the common values between two arrays

		Scanner in=new Scanner(System.in);
       System.out.println("enter the size of an array\n");
		int size= in.nextInt();
		int sum=0;
		 int myarray[] = new int[size];
		 int myarrayanother[] = new int[size];
		System.out.println("enter the array elements\n");
		for(int i=0;i<size;i++)
		{
			myarray[i]= in.nextInt();
			}
		System.out.println("array elements are "+Arrays.toString(myarray));
		System.out.println("enter the array elements\n");
		for(int i=0;i<size;i++)
		{
			myarrayanother[i]= in.nextInt();
			}
		System.out.println("array elements are "+Arrays.toString(myarrayanother));
		
		Commonelement(myarray,myarrayanother);
		
}
}
