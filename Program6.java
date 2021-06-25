package exception_pack;
/*Write a program to create your own exception*/
public class Program6 {
		   static void validate(int age)throws Exception{  
			   try {
		     if(age<18)  
		      throw new Exception(" USER DEFINED EXCEPTION");
			  
		     else  
		      System.out.println("WELCOME");
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