package variable;
import java.util.Scanner;

public class GradeCalc {
	
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("Enter the mark");
		int score= input.nextInt();
		//int score = 70;
		if (score >= 90) {
			System.out.println("A");
		}
		else if (score >= 80) {
			System.out.println("B");
		}
		else if (score >= 70) {
			System.out.println("c");
		}
		else if (score >= 60) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}

	}

}
