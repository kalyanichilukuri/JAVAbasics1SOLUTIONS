package firlstjavaprogrampackage;
import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

public class MinMaxValueArray {
	public static int min(int myarray[])
	{
       int minvalue=myarray[0];
		for(int i=0;i<myarray.length;i++)
		{
		if(myarray[i]<minvalue)
        minvalue=myarray[i];
		}
    return minvalue;
	}
	public static int max(int myarray[])
	{
		int maxvalue=0;
		for(int i=0;i<myarray.length;i++)
		{
				if(myarray[i]>maxvalue)
        maxvalue=myarray[i];
		}
    return maxvalue;
	}
	
		public static void main(String[] args) {
			// Write a function to find the minimum and maximum value of an array

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
			int minvalue=min(myarray);
			System.out.println("minimum element"+minvalue);
			
			int maxvalue=max(myarray);
			System.out.println("maximum element"+maxvalue);
			
	}
	}
