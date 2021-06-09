package firlstjavaprogrampackage;

import java.util.Arrays;
import java.util.Scanner;

public class SpecificTwoValuesArray {

	public static void main(String[] args) {
		// Write a method to verify if the array contains two specified elements(12,23)
		System.out.println("Enter the size of an array");
		Scanner scan=new Scanner(System.in);
	    int size=scan.nextInt();
		int array[]= new int[size];
		System.out.println("Enter the the elements of an array");
		for(int i=0;i<size;i++)
		array[i]=scan.nextInt();
		System.out.println(" array elements are"+Arrays.toString(array));
		System.out.println("enter the two specified elements in an array");
		int specific1=scan.nextInt();
		int specific2=scan.nextInt();
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==specific1 && array[i]==specific2)
		System.out.println("The given specific values are found in an array"+specific1+"  " + specific2);		
		}
		
	}

}
