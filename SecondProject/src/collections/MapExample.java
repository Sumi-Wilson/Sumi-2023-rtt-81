package collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> stringMap  = new HashMap<>();
		stringMap.put("one", 1);
		stringMap.put("two", 2);
		stringMap.put("three", 3);
		//for(String key:stringMap.keySet()) ;{
		
		Map<String, String> strings = new HashMap<>();
		strings.put("one", "This is a single item");
		strings.put("two", "This is two things");

		Map<Integer, String> numbers = new HashMap<>();
		numbers.put(1, "1st");
		numbers.put(2, "2nd");
		numbers.put(3, "3rd");
		numbers.put(4, "4th");

		System.out.println("=============================");

		// to loop over a map .. we have to loop over the set of keys
		// for each key in the keyset .. do something
		for (Integer key : numbers.keySet()) {
			//System.out.println(numbers.keySet());
			String value = numbers.get(key);
			// we have to use the key to look up the value
			System.out.println(key + "=" + value);
		}
			
		
		
		

	}

}
