package collections;

import java.util.TreeMap;

/*TreeMap class also implements NavigableMap; it provides various methods to navigate over the elements of the treemap.
firstKey() - returns the first key of the map.
firstEntry() - returns the key/value mapping of the first key of the map.
lastKey() - returns the last key of the map.
lastEntry() - returns the key/value mapping of the last key of the map.*/

public class ExampleTreeMapTwo {

	public static void main(String[] args) {
		TreeMap<String, Integer> numbers = new TreeMap<>();
		numbers.put("First", 1);
		numbers.put("Second", 2);
		numbers.put("Third", 3);
		System.out.println("TreeMap: " + numbers);

		// Using firstKey() Method
		String s1 = numbers.firstKey();
		System.out.println("First Key " + s1);

		// Using firstEntry() method
		System.out.println("First Entry " + numbers.firstEntry());

		// Using the lastEntry() method
		System.out.println("Last Entry: " + numbers.lastEntry());

		// Using the lastKey() method
		String lastKey = numbers.lastKey();
		System.out.println("Last Key: " + lastKey);
		
		//for(String key:numbers) {
			
		}

	}


