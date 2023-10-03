package collections;

import java.util.ArrayList;
import java.util.List;

/*This example shows:
The use of the isEmpty() method to check if an ArrayList is empty.
The use of the size() method to find the size of an ArrayList.
The use of the get() method to access an element at a particular index in an ArrayList.
The use of the set() method to modify the element at a particular index in an ArrayList.*/


public class AccessElementsFromArrayListExampl {
	public static void main(String[] args) {
		List<String> topCompanies = new ArrayList<>();
		
		// Check if an ArrayList is empty

		System.out.println(topCompanies.isEmpty());
		topCompanies.add("Google");
		topCompanies.add("Apple");
		topCompanies.add("Apple");
		topCompanies.add("Google");
		topCompanies.add("Facebook");

		System.out.println("Here are the top " + topCompanies.size() + " companies in the world");
		System.out.println(topCompanies);


		// Retrieve the element at a given index

		String bestCompany = topCompanies.get(0);
		String secondBestCompany = topCompanies.get(1);
		String lastCompany = topCompanies.get(topCompanies.size() - 1);
		System.out.println("Best Company: " + bestCompany);
        System.out.println("Second Best Company: " + secondBestCompany);
        System.out.println("Last Company in the list: " + lastCompany);

		
		// Modify the element at a given index
        topCompanies.set(4, "Walmart");
        System.out.println("Modified top companies list: " + topCompanies);

	}

}
