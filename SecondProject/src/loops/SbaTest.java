package loops;

public class SbaTest {

	public static void main(String[] args) {
		// SbaTest r1=new SbaTest();
		int sum2 = getDigitsSum(456);
		System.out.println("Sum of all single digit is : " + sum2);
	}

	public static int getDigitsSum(int largeNumber) {
		int sum = 0;
		while (largeNumber > 0) {
			int remainder = largeNumber % 10;
			sum = sum + remainder;
			largeNumber = largeNumber / 10;

		}
		return sum;

	}

}
