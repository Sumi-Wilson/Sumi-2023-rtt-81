package stringmethod;

public class SubstringHomeWork {
	public static void main(String[] args) {
		String example = "this is an example";
		// find the position of the last space in the string

		int lastSpace = example.lastIndexOf(" ");
		System.out.println("The last position of space is at :" + lastSpace);
		// ==========================================

		// substring of the characters between the first and last space of the string

		String sub1 = example.substring(example.indexOf(" ") + 1, example.lastIndexOf(" "));
		System.out.println("the sub string between first and last space is : " + sub1);

		// ===================================================
		
		
		// do the same thing to find the substring between the first and last vowel of the string
		
		int lastVowelPosition = 0;
		int firstVowelPosition = 0;
		for (int i = 0; i < example.length(); i++) {
			if (example.charAt(i) == 'a' || example.charAt(i) == 'e' || example.charAt(i) == 'i'
					|| example.charAt(i) == 'o' || example.charAt(i) == 'u') {
				firstVowelPosition = i;
				break;
				// lastVowelPosition=example.lastIndexOf(i);
			}
		}
		for(int j=0;j<example.length();j++)
		{
			
			
		if (example.charAt(j) == 'a' || example.charAt(j) == 'e' || example.charAt(j) == 'i'
					|| example.charAt(j) == 'o' || example.charAt(j) == 'u') {
				lastVowelPosition=j;
				
			}
		}
		System.out.println("\n\nSubstring between the first and last vowel of the string: "
				+ example.substring(firstVowelPosition, lastVowelPosition));


		
		
		
		
		
		
		

		// use the string.charAt function and use a for loop to loop over the entire
		// string

		for (int i = 0; i <= example.length() - 1; i++) {
			char char1 = example.charAt(i);
			
			System.out.println(char1);
		}

		// ===============================================

		// using only indexOf(" ") print the substring that contains the word "is"
		// use 2 substrings to do this.
		String sub2 = example.substring(example.indexOf(" ") + 1);
		//System.out.println(sub2);
		String sub3 = sub2.substring(0, sub2.indexOf(" "));
		System.out.println(sub3);

	}

}
