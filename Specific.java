package firlstjavaprogrampackage;

import java.util.Arrays;
import java.util.Scanner;
public class Specific {
	public static int size;
	public static boolean findspecificvalue(int myArray[], int item)
	{
		for (int n : myArray) {
	         if (item == n) {
				return true;
			}
		}
			return false;
		}
	public static void main(String[] args) {
		 // to find specific value of an array  
		System.out.println("Enter the required size of the array :: ");
	      Scanner s = new Scanner(System.in);
	      int size = s.nextInt();
	      int myArray[] = new int [size];
	      int sum = 0; 
	      System.out.println("Enter the elements of the array one by one ");

	      for(int i=0; i<size; i++){
	         myArray[i] = s.nextInt();
	        }
	      System.out.println("Elements of the array are: "+Arrays.toString(myArray));
	    int item=0;
	      System.out.println("enter the element to be found in array ::");
	      item=s.nextInt();
	      System.out.println(findspecificvalue(myArray,item));
}
}