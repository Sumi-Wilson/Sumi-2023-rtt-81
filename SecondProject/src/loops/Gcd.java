package loops;

import java.util.Scanner;

public class Gcd {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Gcd g1= new Gcd();
		
			
			try {
				int n1 = g1.readPositiveNumber(scanner);
				int n2 = g1.readPositiveNumber(scanner);
				System.out.println("hai");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		
		
		// Check whether k (for k = 2, 3, 4, and so on) is a common divisor
		// for n1 and n2, until k is greater than n1 or n2.

		// 5 and 15
		// 5 / 1 = 5 , 15 / 1 = 15 = Good !!!
		// 5 / 2 = 2.x , 15 / 2 = 7.x = No good
		// 5 / 3 = 1.x , 15 / 3 = 5 = No good
		// 5 / 4 = 1.x , 15 / 4 = 3.x = No good
		// 5 / 5 = 1 , 15 / 5 = 3 = Good !!!
		// 5 / 6 = 0.x ,
		// 5 / 7 = 0.x ,
		int gcd = 1;
		int min = Math.min(n1, n2);
		for (int k = 1; k <= min; k++) {
			if (n1 % k == 0 && n2 % k == 0) {
				gcd = k;

			}

		}
		System.out.println("the gcd is " + gcd);
	}

	public  int readPositiveNumber(Scanner scanner) throws Exception {
		int number = -1;
		// return number;
		while (number <= 0) {
			try {
			System.out.println("enter a positive number");
			number = scanner.nextInt();
			System.out.println("You entered the number : " + number);
			break;
			}catch(Exception e) {
				System.out.println("The error message is : " + e.getMessage());
				System.out.println("You did not enter a number");
			}
			
			/*if (number <= 0) {
				System.out.println("error:must be poitive");

			}*/

		}return number;
}

}
