package firlstjavaprogrampackage;
import java.io.*;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;
public class ReverseArray {

	public static void main(String[] args) {
		// Write a function to reverse an array of integer values  
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
			
			System.out.println("array elements\n"+Arrays.toString(myarray));
			System.out.print("[");
			
			for(int j=myarray.length-1;j>=0;j--)
			{
				System.out.print(myarray[j]+", ");
			}
			System.out.print("]");
	}
}