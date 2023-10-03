package collections;

import java.util.ArrayList;
import java.util.List;
/*Example 2: Creating an ArrayList From Another Collection
 * How to create an ArrayList from another collection using the ArrayList(Collection c) constructor.
How to add all of the elements from an existing collection to the new ArrayList using the addAll() method.

 */

public class CreateArrayListFromCollectionExampl {
	public static void main(String[] args) {
		List<Integer> firstFivePrimeNumbers = new ArrayList<>();
		firstFivePrimeNumbers.add(2);
		firstFivePrimeNumbers.add(3);
		firstFivePrimeNumbers.add(5);
		firstFivePrimeNumbers.add(7);
		firstFivePrimeNumbers.add(11);
		List<Integer> firstTenPrimeNumbers = new ArrayList<>(firstFivePrimeNumbers);
		List<Integer> nextFivePrimeNumbers = new ArrayList<>();
		System.out.println(firstFivePrimeNumbers);
		System.out.println(firstTenPrimeNumbers);

		nextFivePrimeNumbers.add(13);
		nextFivePrimeNumbers.add(17);
		nextFivePrimeNumbers.add(19);
		nextFivePrimeNumbers.add(23);
		nextFivePrimeNumbers.add(29);
		// firstTenPrimeNumbers.add(nextFivePrimeNumbers);
		firstTenPrimeNumbers.addAll(nextFivePrimeNumbers);
		System.out.println(firstTenPrimeNumbers);

	}

}
