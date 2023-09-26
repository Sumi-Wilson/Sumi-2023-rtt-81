package arrays;

public class ArrayExample {
	public static void main(String[] args) {
		int arraySize = 10;
		double[] doubleArray = new double[arraySize];
		String[] stringArray = new String[arraySize];
		stringArray[1] = "one";
		stringArray[2] = "two";
		stringArray[0] = "zero";
		stringArray[8] = "eight";
		stringArray[9] = "nine";
		for (int pos = 0; pos < arraySize; pos++) {
			System.out.println("the value in position" + pos + "is " + stringArray[pos]);

		}
		for (String value : stringArray) {
			System.out.println("the value =" + value);

		}
		int nullCount = 0;
		for (String value : stringArray) {
			if (value == null) {
				nullCount = nullCount + 1;
			}

		}
		System.out.println("Count of null is " + nullCount);
		// write a for loop to find the location of first null in the array
		int firstNull = -1;
		for (int pos1 = 0; pos1 < stringArray.length; pos1++) {
			if (stringArray[pos1] == null) {
				firstNull = pos1;
				break;
			}

		}
		System.out.println("Position of the first null is " + firstNull);
		// Home Work

		// ***write a loop to tell how many values are not null****
		int notNullCount = 0;
		for (String item : stringArray) {
			if (item != null) {
				notNullCount += 1;

			}
		}
		System.out.println("Count of values in the array that are not null is " + notNullCount);

		// **** write a for loop that tells me the last position of null in the array***
		int lastNull = -1;
		for (int pos2 = 0; pos2 < stringArray.length; pos2++) {
			if (stringArray[pos2] == null) {
				lastNull = pos2;
			}

		}
		System.out.println("Position of the last null is " + lastNull);

		// ****** write a for loop that starts at the final position in the array and
		// counts down to the first position****
		for (int i = stringArray.length - 1; i >= 0; i--) {
			System.out.println("the value in position " + i + " is " + stringArray[i]);

		}
		// Last null position in efficient way
		int lastNull1 = -1;
		for (int pos = stringArray.length - 1; pos >= 0; pos--) {
			if (stringArray[pos] == null) {
				lastNull1 = pos;

				break;

			}

		}
		System.out.println("last null positio " + lastNull1);

		// *****use letters.split(",") to make an array of letters****
		// *****loop over the array and count the number of letters that are not
		// vowels*****
		String letters = "a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z";
		String[] array1 = letters.split(",");
		int countConsonats = 26;
		for (String item1 : array1) {
			// System.out.println(item1);
			if (item1.contains("a")) {
				countConsonats = countConsonats - 1;
			} else if (item1.contains("e")) {
				countConsonats = countConsonats - 1;
			} else if (item1.contains("i")) {
				countConsonats = countConsonats - 1;
			} else if (item1.contains("o")) {
				countConsonats = countConsonats - 1;
			} else if (item1.contains("u")) {
				countConsonats = countConsonats - 1;
			}

		}
		System.out.println("no of consontats " +countConsonats);

		int n1 = 0;
		String vowel = "aeiou";
		for (String letter : array1) {
			if (!vowel.contains(letter)) {
				n1 = n1 + 1;
			}

		}
		System.out.println("number of consonats " + n1);

	}

}
