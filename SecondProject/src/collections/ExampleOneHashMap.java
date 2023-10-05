package collections;

import java.util.HashMap;

/*Example One: Remove HashMap Elements.
To remove elements from a hashmap, we can use the remove() method as shown below.

Create a new Java project and create a new Class named “ExampleOneHashMap ,” and then write the code below in the class.*/


/**
 * 
 */
public class ExampleOneHashMap {
	public static void main(String[]args) {
		HashMap<Integer,String> languages = new HashMap<>();
		languages.put(1, "Java"	);
		languages.put(2, "Python");
		languages.put(3, "JavaScript");
		languages.put(4, "Csharp");
		//System.out.println(languages.get(1));
		
	    System.out.println("HashMaps " +languages);
	    /*for(Integer key:languages.keySet()) {
	    	System.out.println(languages.get(key));
	    	
	    }*/
		String s1 =languages.remove(1);
		System.out.println("Removed value" + s1);
		System.out.println("updated HasMap " +languages);
	    
		
		
		
	}

}
