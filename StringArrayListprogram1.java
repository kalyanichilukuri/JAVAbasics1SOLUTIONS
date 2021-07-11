package collectionspackage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class StringArrayListprogram1 {
	    public static void main(String[] args) {
	        // Creating an ArrayList of String
	        List<String> animals = new ArrayList<>();

	        // a) Adding new elements to the ArrayList
	        animals.add("Lion");
	        animals.add("Tiger");
	        animals.add("Cat");
	        animals.add("Rabbit");
	        animals.add("Mouse");
	        animals.add("Fox");
	        animals.add("Donkey");
	        animals.add("Zibra");
	        animals.add("Deer");

	        System.out.println(animals);
     
	        // Adding an element at a particular index in an ArrayList   
	        // c) Add an element to the ArrayList
	        animals.add(2, "Elephant");
	        System.out.println(animals);
	        /* b) Iterate the Arraylist through iterator object*/
	        ArrayList<String> namesList = new ArrayList<String>(Arrays.asList( "alex", "brian", "charles") );
	         
	        ListIterator<String> listItr = namesList.listIterator();
	         
	        while(listItr.hasNext())
	        {
	            System.out.println(listItr.next());
	        }
	        
	        /*usign for loop for(int i = 0; i < namesList.size(); i++)
{
    System.out.println(namesList.get(i));
}  using for each 

for(String name : namesList)
{
    System.out.println(name);
}  

using while loop 

int index = 0;          
while (namesList.size() > index) 
{
   System.out.println(namesList.get(index++));
}
*
*/
	      /*d) Remove an element from the ArrayList, Remove at an index*/  
	       
animals.remove(4);
System.out.println(animals);
// e) Update the element at a specific index
animals.set(6,"MONKEY");
System.out.println(animals);

//// i)Check the given element is present in the Array list  (f) Check the element is present at a particular index)
System.out.println(animals.contains("Zibra"));
//g)Get an element at a particular index
System.out.println(animals.indexOf("Deer"));
// h) Find out the size of the ArrayList
System.out.println("size of the array list is"+animals.size());
 // Remove all elements of the ArrayLis
namesList.clear();
System.out.println("elemetns are"+namesList);


/* removing an element using foreach 
 * for (String s: namesList) {
         System.out.println(s);
      }
      ListIterator li = aList.listIterator();
      li.next();
      li.remove();
      System.out.println(li);
      System.out.println("\nThe ArrayList elements are: ");
      for (String s: namesList) {
         System.out.println(s);*/
	    }
	}
