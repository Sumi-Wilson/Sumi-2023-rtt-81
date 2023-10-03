package collections;

import java.util.ArrayList;
//Example 1: Creating an ArrayList and Adding New Elements
/*How to create an ArrayList using the ArrayList() constructor.
How to add new elements to an ArrayList using the add() method.*/

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<String> animals = new ArrayList<>();
		animals.add("Lion");
		animals.add("Tiger");
		animals.add("Cat");
		animals.add("Dog");

		System.out.println(animals);
		// Adding an element at a particular index in an ArrayList
		animals.add(2, "Elephant");
		System.out.println(animals);

	}

}
