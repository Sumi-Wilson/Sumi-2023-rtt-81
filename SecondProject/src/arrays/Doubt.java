package arrays;

import java.util.ArrayList;
import java.util.Arrays;


public class Doubt {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		String[] a = {"apple","Orange","Grapes"};
		for (int i = 0; i < a.length; i++){
			//list[i].add(a[i]);
			//list.add("heelo");
			list.add(i, a[i]);
			//System.out.println("hai");
			System.out.println("I have added the string " +a[i] + "at the index" +i);

			
			
		}
		System.out.println(list);
		
		
		}
		
	}


