package exception_pack;
/*Write a program to generate FileNotFoundException*/
import java.io.*;

public class Program11 {

	public static void main(String[] args) throws IOException {
		// Write a program to generate FileNotFoundException
		        try
		        {
		    // creating object of FileReader
		    FileReader reader = new FileReader("file1.txt");
		      
		    // passing FileReader to
		    // buffered reader
		    BufferedReader br = new BufferedReader(reader);
		      
		    // declaring empty string 
		    String data =null;
		      
		    // while loop to read data 
		    // and printing them
		    while ((data = br.readLine()) != null) 
		    {
		        System.out.println(data);
		    }
		      
		    // closing the object
		    br.close();
		        }
		        catch(Exception e)
		        {
		        	System.out.print("Exception is"+e);
		        }
		        }
		  }