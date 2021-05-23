package firlstjavaprogrampackage;

public class Prime {

	public static void main(String[] args) {
		// Write a program to find the prime or not
		 int num = 33, flag = 0;
		   for(int i=2 ; i < num/2 ; i++) {
		      if(num%i == 0) {
		         System.out.println("It is not a prime number"+num);
		         flag = 1;
		         break;
		      }
		   }
		   if(flag == 0) {
			   System.out.println("it is a prime number"+ num);
	}
  }
}