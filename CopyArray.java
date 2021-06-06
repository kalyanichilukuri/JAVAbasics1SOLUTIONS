package firlstjavaprogrampackage;

import java.util.Scanner;
import java.util.Arrays;
public class CopyArray {

	public static void main(String[] args) {
		// Write a function to copy an array to another array
		Scanner in=new Scanner(System.in);
	       System.out.println("enter the size of an array\n");
			int size= in.nextInt();
			int sum=0;
			 int myarray[] = new int[size];
			 int newarray[]=new int[size];
			System.out.println("enter the array elements\n");
			for(int i=0;i<size;i++)
			{
				myarray[i]= in.nextInt();
				
			}
System.out.println("array elements are"+Arrays.toString(myarray));
// array copy
newarray=myarray;
System.out.println("array elements are"+Arrays.toString(newarray));

	}

}
