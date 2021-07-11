package exception_pack;
import java.lang.reflect.Field;  

public class Program14NosuchFiled {

	    public int num;  
	    public static void main(String[] args) throws NoSuchFieldException {  
	        Class<Program1> obj = Program1.class;  
	        Field fields = obj.getField("datavariable of class program1 x type");  
	        System.out.println(fields);  
	        Class<?> tp = fields.getType();  //gets the type   
	        System.out.println(tp);  
	    }  
	}  
	
