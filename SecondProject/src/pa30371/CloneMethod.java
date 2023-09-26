package pa30371;

import java.util.Arrays;

/*Task 3: Write a program that creates an array of String type and initializes it with the
strings “red,” “green,” “blue,” and “yellow.” Print out the array length. Make a copy
using the clone( ) method. Use the Arrays.toString( ) method on the new array to
verify that the original array was copied.*/

public class CloneMethod {
	public static void main(String[] args) {
		String[] colors = { "red", "green", "blue", "yellow" };
		for (int pos = 0; pos < colors.length; pos++) {
			System.out.println(colors[pos]);
		}
		String[] targetcolors = colors.clone();
		System.out.println("colors array :" + Arrays.toString(colors));

		System.out.println("the target array is :" + Arrays.toString(targetcolors));

	}

}
