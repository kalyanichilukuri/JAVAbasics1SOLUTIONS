package collectionspackage;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapoperations {
public static void main(String arg[])
{
	Hashtable<Integer, String> source = new Hashtable<Integer,String>();

	HashMap<Integer, String>  map = new HashMap(source);
	HashMap<Integer, String>  newmap = new HashMap(source);
	
	
	//a) Insert a Key value mapping into the map student id and student name
	map.put(21, "kalyani");
	map.put(22, "rama");
	map.put(23,  "ramakalyani ");
	map.put(24,  "ramkalyani");
	map.put(25,  "kalyanirama");
	map.put(26,  "rkalyani");
								
	map.put(27,  "ramak");
											
	map.put(28,  "ramaakalyani");
	map.put(29,  "kkalyani");
	map.put(30, "chkalyani");
	
	System.out.println("hash table is "+ map);
	// b) Fetch the value of a Key
	//c) clone or copy the hash map
	//map.clone();
	System.out.println("cloning or copying"+map.clone());
	//System.out.println("key in the set"+map.keySet);
	// d)to check if a given key exists in a HashMap
	
	System.out.println(map.containsKey(21));
//	Fetch the value of a Key
	// e)check if a value exist in hash map
	System.out.println("check if a value exist in hash map "+map.containsValue(22));
// f)check the hash map is empty or not 
	boolean isEmpty = map.isEmpty(); 
	System.out.println("Is HashMap is empty: " + isEmpty);
// remove a key in the hash map
	System.out.println("removed list is "+ map.remove(29));
	// g)size of the hash 
	System.out.println("size of map is"+map.size());
	//System.out.println(((Object) map).getValue());
	//b and h)  fetch the value of key  Iterate the map using getkey and getvalue and printing the all keys with keyvalues
	
        // for-each loop 
        for (Entry<Integer, String> e : map.entrySet())
            System.out.println("Key: " + e.getKey()
                               + " Value: " + e.getValue());
    	//i)print the hash map after removing
    	System.out.println(map);
//j) copy one hash map to another hash map
    	newmap=copyMap(map);
        System.out.println(newmap);
    	
	}

private static HashMap<Integer, String> copyMap(HashMap<Integer, String> map) {
	// TODO Auto-generated method stub
	return new HashMap<>(map);
}
	
}
