package variable;

import java.util.Scanner;

public class ControlFlowStatement {

	public static void main(String[] args) {
		// less than 10
		Scanner input = new Scanner(System.in);
		int x = 7;
		if (x < 10) {
			System.out.println("Number is less than 10");
		}
		// if else statement
		int y = 15;
		if (y < 10) {
			System.out.println("Number is less than 10");
		} else {
			System.out.println("Number is greater than 10");
		}
		// number between 10 and 20
		int z = 15;
		if (z < 10) {
			System.out.println("Number is less  than 10");
		} else if ((z > 10) && (z < 20)) {
			System.out.println("Number is between  10 and 20");

		} else if (z > 20) {
			System.out.println("Number is greater than 20");
		}
		// InRange out of range
		int a = 25;
		if ((a < 10) || (a > 20)) {
			System.out.println("Number is out of range");

		} else {
			System.out.println("Number is in range");
		}

		// grade calculation
		System.out.println("Enter the mark");
		int score = input.nextInt();
		// int score = 70;
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("c");
		} else if (score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");

		}
		System.out.println("Enter a number from 1 to 7:");
		int day = input.nextInt();
		switch (day) { 
		 case(1):System.out.println("Sunday");break;
		 case(2):System.out.println("Monday");break;
		 case(3):System.out.println("Tuesday");break;
		 case(4):System.out.println("Wednesday");break;
		 case(5):System.out.println("Thursday");break;
		 case(6):System.out.println("Friday");break;
		 case(7):System.out.println("Saturday");break;
		 
		}
		
		
	}
}
