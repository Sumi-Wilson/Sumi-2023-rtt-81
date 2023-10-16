package arrays;

//Second sba question 1 oct 10
//look MyList
//InvalidStringException

import java.util.ArrayList;

public class ArrayToList implements MyList {
	ArrayList<String> list;

	ArrayToList() {
		list = new ArrayList<>();
	}
	@Override
	public void convert(String[] a) {
		for (int i = 0; i < a.length-1; i++) {
			System.out.println("length"+a.length);
			list.add(i, a[i]);
			System.out.println(list);
			System.out.println("List size "+ list.size());
			
			System.out.println("I have added the string " + a[i] + " at the index " + i);

		}

	}
    @Override
	public void replace(int idx) {
		String s = list.get(idx);
		list.set(idx, "");
		//list.set(idx, "heelo");
		System.out.println(list);
		System.out.println("i have replaced the string:" + s + " with a null string");

	}
    @Override
	public ArrayList<String> compact() {

		for (int i = 0; i < list.size()-1; i++) {
			if (list.get(i) == "") {
				list.remove(i);

			}

		}

		return list;
	}

	public static void main(String[] args) {
		ArrayToList ar = new ArrayToList();
		String[] fruits = { "Apple", "orange", "grapes" };
		ar.convert(fruits);
		ar.replace(0);
		ArrayList<String> list2 = ar.compact();

	}

}
