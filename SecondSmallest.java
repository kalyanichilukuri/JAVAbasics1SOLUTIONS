package firlstjavaprogrampackage;
//import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallest {

	public static int findSecondSmallest(int myarray[])
	{
		int Smallest=myarray[0];
		int secondSmallest=myarray[0];
		for(int i=0;i<myarray.length;i++)
		{ 
			if(myarray[i]<Smallest)
			{
				secondSmallest=Smallest;
				Smallest=myarray[i];
			}
			else if (myarray[i] < secondSmallest)
             secondSmallest=myarray[i];
		}
		return secondSmallest;
	}
	public static void main(String[] args) {
		// Write a method to find the second Smallest number in an array
      Scanner s=new Scanner(System.in);
      System.out.println("enter size of an array");
      int size=s.nextInt();
      int myarray[]=new int[size];
      System.out.println("enter the array elements\n");
      for(int i=0;i<myarray.length;i++)
    	  myarray[i]=s.nextInt();
      System.out.println("second largest element is"+ findSecondSmallest(myarray));
	}
}
