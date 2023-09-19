package variable;

public class ConditionalOperators {
	public static void main(String[] args) {
		boolean cond1 = false;
		boolean cond2 = false;
		if (cond1 && cond2) {
			System.out.println("both variables are true");
		}
		if (cond1 || cond2) {
			System.out.println("either or both the variable is true");
		}
		if (!cond1 && !cond2) {
			System.out.println("niether is true");
		}
		int x = 10;
		if ((x > 3) && (x < 20)) {
			System.out.println("x is between 3 & 20");
		}
		int y = 5;
		if (y % 2 == 1) {
			System.out.println("this a odd number");
		} else {
			System.out.println("This is a even number ");
		}

	}
}
