package pa30371;

import java.util.Arrays;

/*Task 5: Write a program where you create an integer array with a length of 5. Loop
through the array and assign the value of the loop control variable (e.g., i) to the
corresponding index in the array.*/

public class AssaignValueToArray {
	public static void main(String[] args) {
		int[] num = new int[5];
		for (int i = 0; i < num.length; i++) {
			num[i] = i;

		}
		System.out.println(Arrays.toString(num));
//======================================================
		
		

//Task 6: Write a program where you create an integer array of 5 numbers. Loop
//through the array and assign the value of the loop control variable multiplied by 2 to
//the corresponding index in the array.

		int[] a1 = new int[5];
		for (int i = 0; i < a1.length; i++) {
			a1[i] = i * 2;
		}
		System.out.println(Arrays.toString(a1));
		
//=================================================

	
/*Task 7: Write a program where you create an array of 5 elements. Loop through the
array and print the value of each element, except for the middle (index 2) element.*/
		int[] a2= {7,4,2,5,9};
		for(int i=0;i<a2.length;i++) {
			if(i==2) {
				continue;
			}
			System.out.println(a2[i]);
		}
//===================================================
		
		
/*Task 8: Write a program that creates a String array of 5 elements and swaps the first
element with the middle element without creating a new array.*/
		String [] string= {"rose","jasmine","lilly","lotus","orchid"};
		String temp =string[0];
		string[0]=string[2];
		string[2]=temp;
		System.out.println("swaped arry is : "+Arrays.toString(string));
		
//=========================================================
		
/*Task 10: Create an array that includes an integer, 3 strings, and 1 double. Print the
array.*/
		
		String[] s1 = {"asd","hai","hello","6.5"};
		for(int i=0;i<s1.length;i++) {
			System.out.println(s1[i]);
		}
		/*Task 11: Write some Java code that asks the user how many favorite things they
have. Based on their answer, you should create a String array of the correct size.
Then ask the user to enter the things and store them in the array you created. Finally,
print out the contents of the array.*/
		
		
		
		
		
		
	}

}
