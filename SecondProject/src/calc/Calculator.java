package calc;

//import java.util.Scanner;
import java.util.Scanner;

public class Calculator {
	Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		Calculator c = new Calculator();
		//int userSelction = c.menu();
		while (true) {
			int userSelection = c.menu();
			if (userSelection == 1) {
				double sum = c.addition();
				System.out.println("the sum is: " + sum);

			}
			else if (userSelection == 2) {
				double diff = c.subtraction();
				System.out.println("the diffrence is: " + diff);
			}
			else if (userSelection == 3) {
				double product = c.multiplication();
				System.out.println("the product is: " + product);
			}
			else if (userSelection == 4) {
				double quotient = c.division();
				System.out.println("the division is: " + quotient);
			} 
			else if(userSelection == 5) {
				System.exit(0);
			}
			else {
				System.out.println("User selection " + userSelection + " is unknown Try Again!!");
			}
		}

	}

	public int menu() {
		System.out.println("what operation do you want to do");
		System.out.println("enter 1 for addition");
		System.out.println("enter 2 for subtraction");
		System.out.println("enter 3 4or Multiplication");
		System.out.println("enter 4 for division");
		System.out.println("enter 5 for Exit");
		int select = input.nextInt();
		input.nextLine();
		return select;

	}

	public double addition() {
		System.out.println("enter first number: ");
		double num1 = input.nextDouble();
		System.out.println("enter first number: ");
		double num2 = input.nextDouble();

		double ans = num1 + num2;
		return ans;

	}

	public double subtraction() {

		System.out.println("enter first number: ");
		double num1 = input.nextDouble();
		System.out.println("enter first number: ");
		double num2 = input.nextDouble();
		double ans = num1 - num2;
		return ans;

	}

	public double multiplication() {
		System.out.println("enter first number: ");
		double num1 = input.nextDouble();
		System.out.println("enter first number: ");
		double num2 = input.nextDouble();
		double ans = num1 * num2;
		return ans;

	}

	public double division() {
		System.out.println("enter first number: ");
		double num1 = input.nextDouble();
		System.out.println("enter first number: ");
		double num2 = input.nextDouble();
		double ans = num1 / num2;
		return ans;

	}

}