package exception_pack;
/*Write a program to throw exception with your own message*/
public class Program5 {
		   static void validate(int age)throws Exception{  
			   try {
		     if(age<18)  
		      throw new ArithmeticException(" not valid to vote");
			  
		     else  
		      System.out.println("welcome to vote");
			   }
			   catch(Exception e)
			   {
				   System.out.println("hi "+e);   
			   }
		   }  
		   public static void main(String args[])throws Exception{  
		      validate(13);  
		        
		  }  
		}  