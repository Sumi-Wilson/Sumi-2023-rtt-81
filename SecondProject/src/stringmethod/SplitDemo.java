package stringmethod;

import java.util.Arrays;

public class SplitDemo {
	public static void main(String[] args) {
		String vowels = "a::b::c::d:e";

		// splitting the string at "::"
		// storing the result in an array of strings
		String[] result = vowels.split("::");

		// converting array to string and printing it
		System.out.println("result = " + Arrays.toString(result));
		String csv ="a,b,c,d,e,f,g,h";
		String[]commas=csv.split(",");
		System.out.println("Result = " +Arrays.toString(commas));
		
		String name ="Sumi Wilson";
		String[]names =name.split(" ");
		System.out.println("split name is :"+Arrays.toString(names));
		
	}
	
	

}
