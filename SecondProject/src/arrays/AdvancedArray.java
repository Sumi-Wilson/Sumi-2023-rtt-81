package arrays;

import java.util.Arrays;

public class AdvancedArray {
	public static void main(String[] args) {
		double[] numbers = { 6.0, 4.0, 5.3, 1.9, 2.7, 3.2 };
		// find max and min value of the array
		double min = numbers[0];
		double max = numbers[0];
		for (double number : numbers) {
			if (number < min) {
				min = number;
			}
			if (number > max) {
				max = number;
			}
		}
		System.out.println("mimimum is " + min);
		System.out.println("maximum is " + max);

	}
	String[] strings= {"one","two","three"};
	//Arrays.sort(strings);
	

}
