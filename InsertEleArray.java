package firlstjavaprogrampackage;

import java.util.Arrays;
import java.util.Scanner;
public class InsertEleArray {
	public static int myArray[]=new int[100];
//  Write a function to insert an element at a specific position in the array
	public static int size;
	public static void main(String[] args) {
		   int element;
		System.out.println("Enter the required size of the array :: ");
	      Scanner s = new Scanner(System.in);
	      int size = s.nextInt();
	      int myArray[] = new int [size];
	      System.out.println("Enter the elements of the array one by one ");

	      for(int i=0; i<size; i++){
	         myArray[i] = s.nextInt();
	        }
	      System.out.println("Elements of the array are: "+Arrays.toString(myArray));
	    int item=0;
	      System.out.println("enter specific position (index)  ::");
	      item=s.nextInt();
	      System.out.println("enter the element to be placed in the array");
	      element=s.nextInt();
	      myArray[item]=element;
	      System.out.println("Elements of the array are: "+Arrays.toString(myArray));
}
}