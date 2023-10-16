package loops;

public class FirstForLoop {
	public static void main(String[] args) {
		/*for (int i = 0; i < 10; i++) {
			System.out.println("i value is " + i);
			System.out.println("welcome to java: " + i);

		}*/

		int x = 2;
		int y = 0;
		for (; y < 10; ++y) {
			if (y % x == 0)
				continue;
			else if (y == 8) {
				System.out.println(y);
				break;
			}
			else

				System.out.print(y + " ");
		}
	}
}
