package collections;

import java.util.HashMap;

/*Example Two - Create Hashmap and Remove HashMap Elements
Here, we will do multiple things. We will first create a Hashmap. We will then get its values one by one.
After that, we will copy all data of the HashMap to a brand-new HashMap. And finally, we will remove one item and get Hashmap sizes.
If the size is lower by one, the decrease of size by removal is confirmed.*/

public class ExampleTwoHashMap {
	public static void main(String[] args) {
		HashMap<String, String> newHashMap = new HashMap<>();
		newHashMap.put("Key1", "Lenovo");
		// newHashMap.put("Key1", "Lenovo");
		newHashMap.put("Key2", "Motorola");
		newHashMap.put("Key3", "Nokia");
		newHashMap.put("Key4", null);
		newHashMap.put(null, "Sony");
		System.out.println("Original maps contains " + newHashMap);
		 /*for(String key:newHashMap) {
			 
		 }*/

		// Getting Size of hashMap
		System.out.println("the size of Hashmap is " + newHashMap.size());

		// copying one hashmap to other
		HashMap<String, String> copyHashMap = new HashMap<>();
		copyHashMap.putAll(newHashMap);
		System.out.println("The copied HashMap is  " + copyHashMap);

		// Removal of null key
		String nullKeyValue = copyHashMap.remove(null);
		System.out.println("null key value is " + nullKeyValue);
		System.out.println("copyHashMap after removing null key " + copyHashMap);
		System.out.println("Size of copyHashMap is:" + copyHashMap.size());

	}

}
