package exception_pack;



	import java.lang.reflect.*;  
	  
	public class Program13 {	  
	   public static void main(String[] args) {  
	   
	      Program13  obj = new Program13();  
	      Class class1 = obj.getClass();  //gets the class  
	  
	      System.out.println("Field got  =");  
	      try {  
	          
	         Field Flds = class1.getField("str");  
	         System.out.println(" field found: " + Flds.toString());  
	      } catch(NoSuchFieldException e) {  
	         System.out.println(e.toString());  
	      }  
	   }  
	  
	   public Program13() {        
	   }  
	  
	   public Program13(String str) {         
	      this.str = str;  
	   }  
	      
	   public String str = "ITBRIGHT CAREER";  
	}   