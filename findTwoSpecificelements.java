package firlstjavaprogrampackage;
import java.util.Arrays;
import java.util.Scanner;
public class findTwoSpecificelements  {
	public static int size;
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
	    int item1=0,item2=0;
	      System.out.println("enter the element to be found in array ::");
	      item1=s.nextInt();
	      item2=s.nextInt();
	      for (int i=0;i<size;i++){
		         if (myArray[i]==item1)
		        	 System.out.println("element found"+item1);
		         else if(myArray[i]==item2)
		        	 System.out.println("element found"+item2);
			     }
}
	}
