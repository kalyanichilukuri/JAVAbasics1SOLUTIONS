package firlstjavaprogrampackage;

import java.util.Arrays;
import java.util.Scanner;

public class Removearrayele {

	public static void main(String[] args) {
		// Write a function to remove a specific element from an array
		
		System.out.println("Enter the required size of the array :: ");
	      Scanner s = new Scanner(System.in);
	      int size = s.nextInt();
	      int myArray[] = new int [size];
	    int item=0;
	      System.out.println("Enter the elements of the array one by one ");

	      for(int i=0; i<size; i++){
	         myArray[i] = s.nextInt();
	        
	      }
	      System.out.println("Elements of the array are: "+Arrays.toString(myArray));
	      System.out.println("enter element to be remove ::");
	      item=s.nextInt();
	      for( int i=0;i<size;i++)
	      {
	    	  if(myArray[i]==item)
	    		  myArray[i]=0;
	      }
	      System.out.print("item is removed");
	      System.out.println("Elements of the array are: "+Arrays.toString(myArray));
	}
}
