package pa30371;

//1: Write a program that creates an array of integers with a length of 3. Assign
//the values 1, 2,// and 3 to the indexes. Print out each array element.

public class TaskOne {
	public static void main(String[] args) {
		int[] numbers = new int[3];
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 10;
		// numbers.l
		for (int pos = 0; pos <= numbers.length - 1; pos++) {
			System.out.println("the value in position " + pos + " is " + numbers[pos]);

		}

	}

}
