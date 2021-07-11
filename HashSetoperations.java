package collectionspackage;

import java.util.*;  
public class HashSetoperations {
		 public static void main(String args[]){  
	  //Creating HashSet and adding elements   // hash set is not inorder displays randomly avoid duplicate values
	    HashSet<String> set=new HashSet();  
	           set.add("One");    
	           set.add("Two");    
	           set.add("Three");   
	           set.add("Four");  
	           set.add("Five");  
	           set.add("six");  
	           set.add("seven");  
	           set.add("eight");   
	           set.add("nine");  
	           set.add("ten");  
	           set.add("ten");
	           Iterator<String> i=set.iterator();  
	           while(i.hasNext())  
	           {  
	           System.out.println(i.next());  
	           }  
	           //set.addAll() adds all elements set.removeAll() removes all elements   set.clear();   clears the all elements
	           // traversing elements in hash set using ITERATOR
	           Iterator<String> itr=set.iterator();  
	           while(itr.hasNext()){  
	            System.out.println(itr.next());  
	           }           
	          //Removing elements on the basis of specified condition  
	            set.removeIf(str->str.contains("ten"));
	            System.out.println("After invoking removeIf() method: "+set);
	            // checks the hash set is empty 
	            System.out.println(set.isEmpty());
	            //shallow copy or clone 
	            System.out.println(set.clone());
	            
		 }
	 }  
	