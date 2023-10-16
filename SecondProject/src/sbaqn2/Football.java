package sbaqn2;

import java.text.DecimalFormat;

public class Football implements Sport{
	int[] playerIDs = {};
	public Football()
	{
		playerIDs = new int[12];
		for (int i = 0; i < playerIDs.length-1; i++) {
			playerIDs[i] = i;
			System.out.println(playerIDs[i]);
		}
		System.out.println("A new football team has been formed");
	}

	@Override
	public void calculateAvgAge(int[] age) {
		double sum = 0;
		for (int age1 = 0; age1 < age.length; age1++) {

			sum = sum + age[age1];
		}
		// System.out.println("sum "+sum);
		double avg = sum / age.length;

		System.out.println("The average age of the team is " + new DecimalFormat("####.##").format(avg)); // we are
	}

	@Override
	public void retirePlayer(int id) {
		if (playerIDs[id] == -1) {
			System.out.println("Player has already retired");

		} else {
			System.out.println("Player with id: " + id + " has retired");
		}
	}

	public void playerTransfer(int fee, int id) {
		if (playerIDs[id] == -1) {
			System.out.println("Player has already retired");

		} else {
			System.out.println("Player with id: " + id + " has been transferred with a fee of "+fee);
		}
		
	}


}
