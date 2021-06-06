package firlstjavaprogrampackage;
import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {

	public static int findSecondLargest(int myarray[])
	{
		int largest=myarray[0];
		int secondLargest=myarray[0];
		for(int i=0;i<myarray.length;i++)
		{ 
			if(myarray[i]>largest)
			{
				secondLargest=largest;
				largest=myarray[i];
			}
			else if (myarray[i] > secondLargest)
             secondLargest=myarray[i];
		}
		return secondLargest;
	}
	public static void main(String[] args) {
		// Write a method to find the second largest number in an array
      Scanner s=new Scanner(System.in);
      System.out.println("enter size of an array");
      int size=s.nextInt();
      int myarray[]=new int[size];
      System.out.println("enter the array elements\n");
      for(int i=0;i<myarray.length;i++)
    	  myarray[i]=s.nextInt();
      System.out.println("second largest element is"+ findSecondLargest(myarray));
	}
}
