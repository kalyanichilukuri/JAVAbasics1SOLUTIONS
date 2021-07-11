package exception_pack;

public class program16_NumberFormatException {	  
	    private static final String inputString = "324.65";   
	      
	    public static void main(String[] args) {  
	        try {  
	                 int a = Integer.parseInt(inputString);  
	        }catch(NumberFormatException ex){  
	            System.err.println("Invalid string in argumment not ");  
	            //request for well-formatted string  
	        }  
	            }  
	}  