package stringmethod;

import java.util.Arrays;

//7:)spilt Method
public class Main {
	public static void main(String[] args) {
		String vowels = "a::b::c::d:e";
		String[] result = vowels.split("::");
		System.out.println("result="+ Arrays.toString(result));

	}

}
