package pa30371;
//Task 2: Write a program that returns the middle element in an array. Give the following

//values  the integer array: {13, 5, 7, 68, 2} and produce the following output: 7

public class MiddleElement {
	public static void main(String[] args) {
		int[] numbers = { 13, 5, 7, 68, 2 };
		int middle = numbers[numbers.length / 2];
		System.out.println("the middle number is " + middle);

	}

}
