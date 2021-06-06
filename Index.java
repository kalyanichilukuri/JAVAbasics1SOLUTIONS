package firlstjavaprogrampackage;

import java.util.Arrays;
import java.util.Scanner;

public class Index {

	public static void main(String[] args) {
		// to find the index of an array element
		 System.out.println("Enter the required size of the array :: ");
	      Scanner s = new Scanner(System.in);
	      int size = s.nextInt(); int i;
	      int myArray[] = new int [size];
	      int sum = 0;
	      System.out.println("Enter the elements of the array one by one ");

	      for(i=0; i<size; i++){
	         myArray[i] = s.nextInt();
	      }
	      System.out.println("enter the index in the array to be value printed (index staring from 0 to size)");
	      int index = s.nextInt(); int value=0;
	      value=myArray[index];    
	      System.out.println("Elements of the array are: "+Arrays.toString(myArray));
	      System.out.println("index of an array element::"+value);
	}
}
