package firlstjavaprogrampackage;

import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
public class ArrayAvg {

	public static void main(String[] args) {
		// average value of an integer.  Write a function to calculate the average value of an array of integers
      
		Scanner in=new Scanner(System.in);
       System.out.println("enter the size of an array\n");
		int size= in.nextInt();
		int sum=0;
		 int myarray[] = new int[size];
		System.out.println("enter the array elements\n");
		for(int i=0;i<size;i++)
		{
			myarray[i]= in.nextInt();
			sum= sum+myarray[i];
		}
		float avg=sum/2;
		System.out.println("Average value of an array \n"+avg);
		
		

}
}