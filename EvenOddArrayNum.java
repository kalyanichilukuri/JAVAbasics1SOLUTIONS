package firlstjavaprogrampackage;
import java.util.Scanner;
import java.util.Arrays;
public class EvenOddArrayNum {
	 public static void main(String args[]){
//	 Write a method to find number of even number and odd numbers in an array
	 System.out.println("Enter the required size of the array :: ");
     Scanner s = new Scanner(System.in);
     int size = s.nextInt();
     int myArray[] = new int [size];
     System.out.println("Enter the elements of the array one by one ");

     for(int i=0; i<myArray.length; i++){
        myArray[i] = s.nextInt();
       
     }
     System.out.println("Elements of the array are: "+Arrays.toString(myArray));
     for(int i=0;i<myArray.length;i++)
     {
    	 if(myArray[i]%2==0)
    		 
     System.out.println("Even ::"+myArray[i]);
    	 else
    		 System.out.println("odd ::"+myArray[i]);
     		 
  }
}
}