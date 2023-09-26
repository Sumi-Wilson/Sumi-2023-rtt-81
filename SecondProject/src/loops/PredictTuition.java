package loops;

public class PredictTuition {
	public static void main(String[] args) {
		int yr = 0;
		double fee = 10000;
		while (fee < 20000) {
			fee = (fee + (fee * .07));
			yr = yr + 1;
		}
		System.out.println("the fess will double in " + yr + " from here");

	}

}
