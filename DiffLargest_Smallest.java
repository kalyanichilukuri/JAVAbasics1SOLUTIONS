package firlstjavaprogrampackage;
import java.util.Scanner;
import java.util.Arrays;

public class DiffLargest_Smallest {

	public static int largest(int array[])
	{
		int large=0;
		large=array[0];
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>large);
				large=array[i];
		}
		return large;
	}
	public static int smallest(int array[])
	{
		int small=0;
		small=array[0];
		for(int i=0;i<array.length;i++)
		{
			if(array[i]<small)
				small=array[i];
		}
		return small;
	}
	public static void main(String[] args) {
		//Write a function to get the difference of largest and smallest value
		System.out.println("Enter the size of an array");
		Scanner scan=new Scanner(System.in);
	    int size=scan.nextInt();
		int array[]= new int[size];
		System.out.println("Enter the the elements of an array");
		for(int i=0;i<size;i++)
		array[i]=scan.nextInt();
		System.out.println(" array elements are"+Arrays.toString(array));
		
		int result = largest(array)-smallest(array);
		System.out.println("difference between largest and smallest values of an array "+result);
		
	}

}
