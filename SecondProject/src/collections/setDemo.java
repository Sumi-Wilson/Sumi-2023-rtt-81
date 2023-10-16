package collections;

import java.util.HashSet;
import java.util.Set;

public class setDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String>stringSet=new HashSet<>();
		stringSet.add("a");
		stringSet.add("b");
		stringSet.add("c");
		stringSet.add("a");
		for(String string:stringSet) {
			System.out.println(string);
			
		}
		
		
		

	}

}
