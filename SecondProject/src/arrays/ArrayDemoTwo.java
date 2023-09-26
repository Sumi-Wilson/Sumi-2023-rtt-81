package arrays;
//Example 2: Using for Loop for access array elements

public class ArrayDemoTwo {
	public static void main(String[] args) {
		// create an array
		int[] age = { 12, 4, 5 };
		// loop through the array
		// using for loop
		System.out.println("Using for Loop:");
		for (int i = 0; i < age.length; i++) {
			System.out.println(age[i]);
		}
	}

}
