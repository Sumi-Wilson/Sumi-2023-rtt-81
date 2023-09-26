package arrays;
//Example 4: Compute the Sum and Average of Array Element

public class ComputeSumArray {
	public static void main(String[] args) {
		int[] numbers = { 2, -9, 0, 5, 12, -25, 22, 9, 8, 12 };
		int sum = 0;
		double average;
		for (int num : numbers) {
			sum = sum + num;
		}
		int len = numbers.length;
		average = ((double) sum / (double) len);
		System.out.println("Sum is : " + sum + "\nAverage is: " + average);

	}

}
