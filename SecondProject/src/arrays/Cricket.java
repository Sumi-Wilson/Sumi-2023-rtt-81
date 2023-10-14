package arrays;

import java.text.DecimalFormat;

public class Cricket {
	DecimalFormat df = new DecimalFormat("0.00");
	int[] playersIDs;

	Cricket() {
		playersIDs = new int[12];
		for (int i = 1; i < playersIDs.length; i++) {
			playersIDs[i] = 1;
			//System.out.println(playersIDs[i]);

		}
		System.out.println("A new cricket team has been formed");

	}

	void calculateAverageAge(int[] age) {
		int sum = 0;
		int i = 0;
		double averageAge = 0.0;
		for (i = 0; i < age.length; i++) {
			sum = sum + age[i];
		}
		averageAge = (double) sum / i;
		System.out.println("sum " + sum);
		System.out.println(averageAge);
		System.out.println("The average age of team is " + df.format(averageAge));

	}

	void retirePlayer(int id) {
		System.out.println(playersIDs[id]);
		System.out.println("Player with id: " + id + " has retired");
		playersIDs[id] = -1;
		for (int i = 1; i < playersIDs.length; i++) {
			System.out.println(playersIDs[i]);
		}
		
		/*if (playersIDs[id] != -1) {
			//playersIDs[id] = -1;
			//System.out.println(playersIDs[id]);
			System.out.println("Player with id: " + id + " has retired");
			playersIDs[id] = -1;
			System.out.println(playersIDs[id]);
		}
		else  {
			System.out.println("player has already retired");
		}*/
		
		/*System.out.println(id);
		if (playersIDs[id] == -1) {
			System.out.println("player has already retired");
		} else if (playersIDs[id] == 1) {
			playersIDs[id] = -1;
			System.out.println("Player with id: " + id + " has retired");

		}*/
	}

	// playersIDs[id]=-1;
	/*
	 * for(int i=0;i<playersIDs.length;i++) { /*if(playersIDs[id]==1) {
	 * playersIDs[id]=-1; System.out.println("Player with id: "+id+" has retired");
	 * }else if(playersIDs[id]==-1) {
	 * System.out.println("player has already retired"); }
	 * 
	 * }
	 */
	// }
	public static void main(String[] args) {
		Cricket c = new Cricket();
		int[] age1 = { 32, 20, 18, 23, 30, 34, 24 };
		c.calculateAverageAge(age1);
		c.retirePlayer(10);
	}

}
