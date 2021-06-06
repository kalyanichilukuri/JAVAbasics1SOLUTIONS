package firlstjavaprogrampackage;

import java.util.Arrays;
import java.util.Scanner;

public class LargestSmallestNumberArray {

	public static int largest(int myarray[])
	{
		int i;
		int largevalue=myarray[0]; 
		for(i=0;i<myarray.length;i++)
		{
			if(myarray[i]>largevalue)
				largevalue=myarray[i];
		}

		return largevalue;
	}
	
	public static int smallest(int myarray[])
	{
		int i;
		int smallestvalue=myarray[0];
		for(i=0;i<myarray.length;i++)
		{
			if(myarray[i]<smallestvalue)
				smallestvalue=myarray[i];
		}
		return smallestvalue;
	}
	
	public static void main(String[] args) {
		// to get difference between largest and smallest number
		 System.out.println("Enter the required size of the array :: ");
	      Scanner s = new Scanner(System.in);
	      int size = s.nextInt();
	      int myArray[] = new int [size];
	     
	      System.out.println("Enter the elements of the array one by one ");

	      for(int i=0; i<size; i++){
	         myArray[i] = s.nextInt();
	      }
	      System.out.println("Elements of the array are: "+Arrays.toString(myArray));
	      System.out.println("Largest "+largest(myArray));
	      System.out.println("Smallest" +smallest(myArray));
	int diff= largest(myArray)-smallest(myArray);
    System.out.println("DIFFERENCE IS" +diff);
	
	}

}
